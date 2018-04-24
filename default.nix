with import <nixpkgs> {};

stdenv.mkDerivation {
  name = "veriphy-client";
  src = ./.;
  buildPhase = ''
    ${pkgs.maven}/bin/mvn -Dmaven.repo.local=repo package
  '';
  installPhase = ''
    mkdir -p $out
    cp target/swagger-java-client-1.0.0.jar $out
    cp target/lib/* $out
  '';
} 
