package pravda.dotnet

import pravda.dotnet.CIL._
import pravda.dotnet.Signatures.SigType._
import pravda.dotnet.Signatures._
import pravda.dotnet.TablesData._
import utest._

object SmartProgramTests extends TestSuite {

  val tests = Tests {
    'smartProgramParse - {
      val Right((_, cilData, methods, signatures)) = PeParsersUtils.parsePe("smart_program.exe")

      /*cilData.tables ==> TablesData(
        List(FieldData(1, "balances", 65), FieldData(1, "sender", 74)),
        List(
          MemberRefData(9, ".ctor", 1),
          MemberRefData(17, ".ctor", 6),
          MemberRefData(25, ".ctor", 10),
          MemberRefData(12, "get", 28),
          MemberRefData(12, "getDefault", 39),
          MemberRefData(12, "put", 48),
          MemberRefData(41, ".ctor", 6),
          MemberRefData(49, ".ctor", 6)
        ),
        List(
          MethodDefData(0, 134, "balanceOf", 78, List(ParamData(0, 1, "tokenOwner"))),
          MethodDefData(0, 134, "transfer", 84, List(ParamData(0, 1, "to"), ParamData(0, 2, "tokens"))),
          MethodDefData(0, 6278, ".ctor", 6, List()),
          MethodDefData(0, 150, "Main", 91, List()),
          MethodDefData(0, 6278, ".ctor", 6, List()),
          MethodDefData(0, 6278, ".ctor", 6, List()),
          MethodDefData(0, 1478, "get", 28, List(ParamData(0, 1, "key"))),
          MethodDefData(0, 1478, "exists", 95, List(ParamData(0, 1, "key"))),
          MethodDefData(0, 1478, "put", 48, List(ParamData(0, 1, "key"), ParamData(0, 2, "value"))),
          MethodDefData(0, 1478, "getDefault", 39, List(ParamData(0, 1, "key"), ParamData(0, 2, "def"))),
          MethodDefData(0, 6278, ".ctor", 6, List()),
          MethodDefData(0, 6278, ".ctor", 6, List()),
          MethodDefData(0, 6278, ".ctor", 6, List())
        ),
        List(
          ParamData(0, 1, "tokenOwner"),
          ParamData(0, 1, "to"),
          ParamData(0, 2, "tokens"),
          ParamData(0, 1, "key"),
          ParamData(0, 1, "key"),
          ParamData(0, 1, "key"),
          ParamData(0, 2, "value"),
          ParamData(0, 1, "key"),
          ParamData(0, 2, "def")
        ),
        List(
          TypeDefData(
            0,
            "<Module>",
            "",
            Ignored,
            List(),
            List()
          ),
          TypeDefData(
            1048576,
            "MyProgram",
            "",
            Ignored,
            List(FieldData(1, "balances", 65), FieldData(1, "sender", 74)),
            List(
              MethodDefData(0, 134, "balanceOf", 78, List(ParamData(0, 1, "tokenOwner"))),
              MethodDefData(0, 134, "transfer", 84, List(ParamData(0, 1, "to"), ParamData(0, 2, "tokens"))),
              MethodDefData(0, 6278, ".ctor", 6, List())
            )
          ),
          TypeDefData(
            1048576,
            "MainClass",
            "",
            Ignored,
            List(),
            List(MethodDefData(0, 150, "Main", 91, List()), MethodDefData(0, 6278, ".ctor", 6, List()))
          ),
          TypeDefData(1048577,
                      "Program",
                      "io.mytc.pravda",
                      Ignored,
                      List(),
                      List(MethodDefData(0, 6278, ".ctor", 6, List()))),
          TypeDefData(
            161,
            "Mapping`2",
            "io.mytc.pravda",
            Ignored,
            List(),
            List(
              MethodDefData(0, 1478, "get", 28, List(ParamData(0, 1, "key"))),
              MethodDefData(0, 1478, "exists", 95, List(ParamData(0, 1, "key"))),
              MethodDefData(0, 1478, "put", 48, List(ParamData(0, 1, "key"), ParamData(0, 2, "value"))),
              MethodDefData(0, 1478, "getDefault", 39, List(ParamData(0, 1, "key"), ParamData(0, 2, "def")))
            )
          ),
          TypeDefData(1048577,
                      "Address",
                      "io.mytc.pravda",
                      Ignored,
                      List(),
                      List(MethodDefData(0, 6278, ".ctor", 6, List()))),
          TypeDefData(1048577,
                      "Data",
                      "io.mytc.pravda",
                      Ignored,
                      List(),
                      List(MethodDefData(0, 6278, ".ctor", 6, List()))),
          TypeDefData(1048577, "Word", "io.mytc.pravda", Ignored, List(), List())
        ),
        List(
          TypeRefData(6, "CompilationRelaxationsAttribute", "System.Runtime.CompilerServices"),
          TypeRefData(6, "RuntimeCompatibilityAttribute", "System.Runtime.CompilerServices"),
          TypeRefData(6, "DebuggableAttribute", "System.Diagnostics"),
          TypeRefData(15, "DebuggingModes", ""),
          TypeRefData(6, "Object", "System"),
          TypeRefData(6, "Attribute", "System")
        ),
        List(StandAloneSigData(16), StandAloneSigData(35))
      )*/

      methods ==> List(
        Method(
          List(
            Nop,
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg1,
            CallVirt(MemberRefData(TypeSpecData(20), "get", 28)),
            StLoc0,
            BrS(0),
            LdLoc0,
            Ret
          ),
          2,
          Some(16)
        ),
        Method(
          List(
            Nop,
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg0,
            LdFld(FieldData(1, "sender", 95)),
            LdcI40,
            CallVirt(MemberRefData(TypeSpecData(20), "getDefault", 39)),
            LdArg2,
            Clt,
            LdcI40,
            Ceq,
            StLoc0,
            LdLoc0,
            BrFalseS(68),
            Nop,
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg0,
            LdFld(FieldData(1, "sender", 95)),
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg0,
            LdFld(FieldData(1, "sender", 95)),
            LdcI40,
            CallVirt(MemberRefData(TypeSpecData(20), "getDefault", 39)),
            LdArg2,
            Sub,
            CallVirt(MemberRefData(TypeSpecData(20), "put", 48)),
            Nop,
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg1,
            LdArg0,
            LdFld(FieldData(1, "balances", 86)),
            LdArg1,
            LdcI40,
            CallVirt(MemberRefData(TypeSpecData(20), "getDefault", 39)),
            LdArg2,
            Add,
            CallVirt(MemberRefData(TypeSpecData(20), "put", 48)),
            Nop,
            Nop,
            Ret
          ),
          5,
          Some(35)
        ),
        Method(
          List(
            LdArg0,
            LdNull,
            StFld(FieldData(1, "balances", 86)),
            LdArg0,
            LdNull,
            StFld(FieldData(1, "sender", 95)),
            LdArg0,
            Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)),
            Nop,
            Ret
          ),
          0,
          None
        ),
        Method(List(Nop, Ret), 0, None),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)), Nop, Ret), 0, None),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Attribute", "System"), ".ctor", 6)), Nop, Ret), 0, None),
        Method(List(), 0, None),
        Method(List(), 0, None),
        Method(List(), 0, None),
        Method(
          List(
            Nop,
            LdArg0,
            LdArg1,
            CallVirt(MemberRefData(TypeSpecData(62), "exists", 71)),
            LdcI40,
            Ceq,
            StLoc0,
            LdLoc0,
            BrFalseS(5),
            Nop,
            LdArg2,
            StLoc1,
            BrS(11),
            Nop,
            LdArg0,
            LdArg1,
            CallVirt(MemberRefData(TypeSpecData(62), "get", 28)),
            StLoc1,
            BrS(0),
            LdLoc1,
            Ret
          ),
          2,
          Some(56)
        ),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)), Nop, Ret), 0, None),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)), Nop, Ret), 0, None),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)), Nop, Ret), 0, None),
        Method(List(LdArg0, Call(MemberRefData(TypeRefData(6, "Object", "System"), ".ctor", 6)), Nop, Ret), 0, None)
      )

      signatures ==> Map(
        10 -> MethodRefDefSig(true,
                              false,
                              false,
                              false,
                              0,
                              Tpe(Void, false),
                              List(Tpe(ValueTpe(TypeRefData(15, "DebuggingModes", "")), false))),
        56 -> LocalVarSig(List(LocalVar(Boolean, false), LocalVar(Var(1), false))),
        20 -> TypeSig(
          Tpe(
            Generic(
              Cls(TypeDefData(
                1048705,
                "Mapping`2",
                "io.mytc.pravda",
                Ignored,
                List(),
                List(
                  MethodDefData(0, 1478, "get", 28, List(ParamData(0, 1, "key"))),
                  MethodDefData(0, 1478, "exists", 71, List(ParamData(0, 1, "key"))),
                  MethodDefData(0, 1478, "put", 48, List(ParamData(0, 1, "key"), ParamData(0, 2, "value"))),
                  MethodDefData(0, 134, "getDefault", 39, List(ParamData(0, 1, "key"), ParamData(0, 2, "def"))),
                  MethodDefData(0, 6276, ".ctor", 6, List())
                )
              )),
              List(Cls(
                     TypeDefData(1048577,
                                 "Address",
                                 "io.mytc.pravda",
                                 Ignored,
                                 List(),
                                 List(MethodDefData(0, 6278, ".ctor", 6, List())))),
                   I4)
            ),
            false
          )),
        1 -> MethodRefDefSig(true, false, false, false, 0, Tpe(Void, false), List(Tpe(I4, false))),
        6 -> MethodRefDefSig(true, false, false, false, 0, Tpe(Void, false), List()),
        28 -> MethodRefDefSig(true, false, false, false, 0, Tpe(Var(1), false), List(Tpe(Var(0), false))),
        105 -> MethodRefDefSig(
          true,
          false,
          false,
          false,
          0,
          Tpe(Void, false),
          List(Tpe(Cls(
                     TypeDefData(1048577,
                                 "Address",
                                 "io.mytc.pravda",
                                 Ignored,
                                 List(),
                                 List(MethodDefData(0, 6278, ".ctor", 6, List())))),
                   false),
               Tpe(I4, false))
        ),
        71 -> MethodRefDefSig(true, false, false, false, 0, Tpe(Boolean, false), List(Tpe(Var(0), false))),
        86 -> FieldSig(
          Generic(
            Cls(TypeDefData(
              1048705,
              "Mapping`2",
              "io.mytc.pravda",
              Ignored,
              List(),
              List(
                MethodDefData(0, 1478, "get", 28, List(ParamData(0, 1, "key"))),
                MethodDefData(0, 1478, "exists", 71, List(ParamData(0, 1, "key"))),
                MethodDefData(0, 1478, "put", 48, List(ParamData(0, 1, "key"), ParamData(0, 2, "value"))),
                MethodDefData(0, 134, "getDefault", 39, List(ParamData(0, 1, "key"), ParamData(0, 2, "def"))),
                MethodDefData(0, 6276, ".ctor", 6, List())
              )
            )),
            List(Cls(
                   TypeDefData(1048577,
                               "Address",
                               "io.mytc.pravda",
                               Ignored,
                               List(),
                               List(MethodDefData(0, 6278, ".ctor", 6, List())))),
                 I4)
          )),
        39 -> MethodRefDefSig(true,
                              false,
                              false,
                              false,
                              0,
                              Tpe(Var(1), false),
                              List(Tpe(Var(0), false), Tpe(Var(1), false))),
        35 -> LocalVarSig(List(LocalVar(Boolean, false))),
        112 -> MethodRefDefSig(false, false, false, false, 0, Tpe(Void, false), List()),
        48 -> MethodRefDefSig(true,
                              false,
                              false,
                              false,
                              0,
                              Tpe(Void, false),
                              List(Tpe(Var(0), false), Tpe(Var(1), false))),
        95 -> FieldSig(
          Cls(
            TypeDefData(1048577,
                        "Address",
                        "io.mytc.pravda",
                        Ignored,
                        List(),
                        List(MethodDefData(0, 6278, ".ctor", 6, List()))))),
        16 -> LocalVarSig(List(LocalVar(I4, false))),
        99 -> MethodRefDefSig(
          true,
          false,
          false,
          false,
          0,
          Tpe(I4, false),
          List(
            Tpe(Cls(
                  TypeDefData(1048577,
                              "Address",
                              "io.mytc.pravda",
                              Ignored,
                              List(),
                              List(MethodDefData(0, 6278, ".ctor", 6, List())))),
                false))
        ),
        62 -> TypeSig(
          Tpe(
            Generic(
              Cls(TypeDefData(
                1048705,
                "Mapping`2",
                "io.mytc.pravda",
                Ignored,
                List(),
                List(
                  MethodDefData(0, 1478, "get", 28, List(ParamData(0, 1, "key"))),
                  MethodDefData(0, 1478, "exists", 71, List(ParamData(0, 1, "key"))),
                  MethodDefData(0, 1478, "put", 48, List(ParamData(0, 1, "key"), ParamData(0, 2, "value"))),
                  MethodDefData(0, 134, "getDefault", 39, List(ParamData(0, 1, "key"), ParamData(0, 2, "def"))),
                  MethodDefData(0, 6276, ".ctor", 6, List())
                )
              )),
              List(Var(0), Var(1))
            ),
            false
          ))
      )

      import pravda.vm.asm.Datum._
      import pravda.vm.asm.Op._

      def bytes(is: Int*): Array[Byte] =
        Array[Byte](is.map(_.toByte): _*)

      Translator.translate(methods, cilData, signatures) ==>
        List(
          Dup,
          Push(Rawbytes("balanceOf".getBytes)),
          Eq,
          JumpI("method_balanceOf"),
          Dup,
          Push(Rawbytes("transfer".getBytes)),
          Eq,
          JumpI("method_transfer"),
          Dup,
          Push(Rawbytes("Main".getBytes)),
          Eq,
          JumpI("method_Main"),
          Jump("stop"),
          Label("method_balanceOf"),
          Push(Integral(0)),
          Nop,
          Push(Rawbytes("balances".getBytes)),
          Push(Integral(4)),
          Dupn,
          Swap,
          Concat,
          SGet,
          Push(Integral(2)),
          SwapN,
          Pop,
          Nop,
          Push(Integral(1)),
          Dupn,
          Jump("stop"),
          Label("method_transfer"),
          Push(Integral(0)),
          Nop,
          Push(Rawbytes("balances".getBytes)),
          From,
          Push(Rawbytes(bytes(1, 0, 0, 0, 0))),
          Call("method_getDefault"),
          Push(Integral(4)),
          Dupn,
          LCall("Typed", "typedClt", 2),
          Push(Rawbytes(bytes(1, 0, 0, 0, 0))),
          Eq,
          Push(Integral(2)),
          SwapN,
          Pop,
          Push(Integral(1)),
          Dupn,
          Not,
          JumpI("br97"),
          Nop,
          Push(Rawbytes("balances".getBytes)),
          From,
          Push(Rawbytes("balances".getBytes)),
          From,
          Push(Rawbytes(bytes(1, 0, 0, 0, 0))),
          Call("method_getDefault"),
          Push(Integral(6)),
          Dupn,
          Swap,
          Push(Rawbytes(bytes(1, -1, -1, -1, -1))),
          LCall("Typed", "typedMull", 2),
          LCall("Typed", "typedAdd", 2),
          Push(Integral(2)),
          Dupn,
          Push(Integral(4)),
          Dupn,
          Concat,
          Swap,
          SPut,
          Pop,
          Pop,
          Nop,
          Push(Rawbytes("balances".getBytes)),
          Push(Integral(5)),
          Dupn,
          Push(Rawbytes("balances".getBytes)),
          Push(Integral(7)),
          Dupn,
          Push(Rawbytes(bytes(1, 0, 0, 0, 0))),
          Call("method_getDefault"),
          Push(Integral(6)),
          Dupn,
          LCall("Typed", "typedAdd", 2),
          Push(Integral(2)),
          Dupn,
          Push(Integral(4)),
          Dupn,
          Concat,
          Swap,
          SPut,
          Pop,
          Pop,
          Nop,
          Nop,
          Label("br97"),
          Jump("stop"),
          Label("method_Main"),
          Nop,
          Jump("stop"),
          Label("method_get"),
          Ret,
          Label("method_exists"),
          Ret,
          Label("method_put"),
          Ret,
          Label("method_getDefault"),
          Push(Integral(0)),
          Push(Integral(0)),
          Nop,
          Push(Integral(5)),
          Dupn,
          Push(Integral(5)),
          Dupn,
          Swap,
          Concat,
          SExst,
          Push(Rawbytes(bytes(1, 0, 0, 0, 0))),
          Eq,
          Push(Integral(3)),
          SwapN,
          Pop,
          Push(Integral(2)),
          Dupn,
          Not,
          JumpI("br20"),
          Nop,
          Push(Integral(3)),
          Dupn,
          Push(Integral(2)),
          SwapN,
          Pop,
          Jump("br31"),
          Label("br20"),
          Nop,
          Push(Integral(5)),
          Dupn,
          Push(Integral(5)),
          Dupn,
          Swap,
          Concat,
          SGet,
          Push(Integral(2)),
          SwapN,
          Pop,
          Nop,
          Label("br31"),
          Push(Integral(1)),
          Dupn,
          Ret,
          Label("stop")
        )
    }
  }
}
