using System;
using Autodesk.Maya.OpenMaya;
using MayaLispPlugin;

// It seems that assembly is not supported by ClojureClr so far. So I need a .net wrapper here
[assembly: MPxCommandClass(typeof(MayaLispPlugin.helloWorldCmd), "helloWorldCmd")]
