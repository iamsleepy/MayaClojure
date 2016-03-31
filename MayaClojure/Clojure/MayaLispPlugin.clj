(assembly-load-from "bin/openmayacs.dll")
(ns MayaLispPlugin
	(:require [clojure.core])	
	(:gen-class 
		:name MayaLispPlugin.helloWorldCmd
		:extends Autodesk.Maya.OpenMaya.MPxCommand
		:implements [Autodesk.Maya.OpenMaya.IMPxCommand]		
		:main false				
		)
	)

(defn -doIt [this args] 
	(Autodesk.Maya.OpenMaya.MGlobal/displayInfo "Hello World!\n"))

