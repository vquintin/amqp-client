
# this file originates from SBTix
{ pkgs ? import <nixpkgs> {} }:

with pkgs;

let
  sbtix = callPackage ./sbtix.nix {};
in
  sbtix.buildSbtLibrary {
    name = "amqp-client";
    src = ./.;
    repo = [
      (import ./repo.nix)
      (import ./project/repo.nix)
      (import ./manual-repo.nix)
    ];
  }
