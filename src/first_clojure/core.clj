(ns first-clojure.core)

; Load Current File - ctrl+alt+c enter
; Evaluate Current Form - ctrl+enter
; Evaluate Top Level Form - atl+enter
; Clear Evaluation - esc
;
; Expand Selection - ctrl+w
; Align Map Values - ctrl+alt+l
; 
; Run Current NS Tests - ctrl+alt+c t
; Run Current NS Tests - ctrl+alt+c shift+t

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn bar
  []
  (println "wtf"))

(map #(* % 2) '(1 2 3))

 (concat [2]
   (map #(inc (* % 2))
     (filter #(aget 2 %)
       (range 1 3))))