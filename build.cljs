(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'lurest.core
   :output-to "main.js"
   :optimizations :none
   :npm-deps {:diet "0.16.0"}
   :install-deps true
   :target :nodejs})
