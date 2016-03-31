; It will generate a System.Runtime.Assembly.LoadFrom call, so we'd better to put it in the correct working path. 
; openmayacs.dll is located inside of the bin folder, so I'll make it same as the Maya folder structure.
(assembly-load-from "bin/openmayacs.dll")
(ns MayaLispPlugin
	(:require [clojure.core])	
	(:gen-class 
		:name MayaLispPlugin.helloWorldCmd
		:extends Autodesk.Maya.OpenMaya.MPxCommand
		:implements [Autodesk.Maya.OpenMaya.IMPxCommand]		
		; We need a dll, not executable
		:main false				
		)
	)

; Override do it function, clojureClr uses invoke functions, so the first parameter should be instance going to be invoked. Then, we'll have usual MArgList parameter.
(defn -doIt [this args] 
	(Autodesk.Maya.OpenMaya.MGlobal/displayInfo "Hello World!\n"))

