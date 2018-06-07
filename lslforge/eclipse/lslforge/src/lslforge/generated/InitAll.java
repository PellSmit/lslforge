package lslforge.generated;
import com.thoughtworks.xstream.XStream;
public class InitAll {
    public static void initAll(XStream xstream) {
        Either.init(xstream);
        Either_Left.init(xstream);
        Either_Right.init(xstream);
        Maybe.init(xstream);
        Maybe_Nothing.init(xstream);
        Maybe_Just.init(xstream);
        Tuple2.init(xstream);
        Tuple3.init(xstream);
        CodeElement.init(xstream);
        CodeElement_CodeElement.init(xstream);
        CompilationCommand.init(xstream);
        CompilationCommand_Init.init(xstream);
        CompilationCommand_UpdateModule.init(xstream);
        CompilationCommand_UpdateScript.init(xstream);
        CompilationCommand_RemoveScript.init(xstream);
        CompilationCommand_RemoveModule.init(xstream);
        CompilationCommand_CheckModule.init(xstream);
        CompilationCommand_CheckScript.init(xstream);
        CompilationResponse.init(xstream);
        CompilationResponse_FullSourceValidation.init(xstream);
        CompilationResponse_ModuleResponse.init(xstream);
        CompilationResponse_ScriptResponse.init(xstream);
        CompilationStatus.init(xstream);
        CompilationStatus_CompilationStatus.init(xstream);
        EPKind.init(xstream);
        EPKind_EPFunc.init(xstream);
        EPKind_EPHandler.init(xstream);
        EPSummary.init(xstream);
        EPSummary_EPSummary.init(xstream);
        ErrInfo.init(xstream);
        ErrInfo_ErrInfo.init(xstream);
        GlobalSummary.init(xstream);
        GlobalSummary_GlobalSummary.init(xstream);
        Pragma.init(xstream);
        Pragma_PragmaInline.init(xstream);
        Pragma_PragmaNoInline.init(xstream);
        Component.init(xstream);
        Component_X.init(xstream);
        Component_Y.init(xstream);
        Component_Z.init(xstream);
        Component_S.init(xstream);
        Component_All.init(xstream);
        LSLType.init(xstream);
        LSLType_LLList.init(xstream);
        LSLType_LLInteger.init(xstream);
        LSLType_LLVector.init(xstream);
        LSLType_LLFloat.init(xstream);
        LSLType_LLString.init(xstream);
        LSLType_LLRot.init(xstream);
        LSLType_LLKey.init(xstream);
        LSLType_LLVoid.init(xstream);
        Ctx.init(xstream);
        Ctx_Ctx.init(xstream);
        Expr.init(xstream);
        Expr_IntLit.init(xstream);
        Expr_FloatLit.init(xstream);
        Expr_StringLit.init(xstream);
        Expr_ListExpr.init(xstream);
        Expr_VecExpr.init(xstream);
        Expr_RotExpr.init(xstream);
        Expr_KeyLit.init(xstream);
        Expr_Call.init(xstream);
        Expr_Add.init(xstream);
        Expr_Sub.init(xstream);
        Expr_Mul.init(xstream);
        Expr_Div.init(xstream);
        Expr_Mod.init(xstream);
        Expr_Get.init(xstream);
        Expr_Set.init(xstream);
        Expr_BAnd.init(xstream);
        Expr_BOr.init(xstream);
        Expr_Xor.init(xstream);
        Expr_ShiftL.init(xstream);
        Expr_ShiftR.init(xstream);
        Expr_And.init(xstream);
        Expr_Or.init(xstream);
        Expr_Equal.init(xstream);
        Expr_NotEqual.init(xstream);
        Expr_Lt.init(xstream);
        Expr_Le.init(xstream);
        Expr_Gt.init(xstream);
        Expr_Ge.init(xstream);
        Expr_IncBy.init(xstream);
        Expr_DecBy.init(xstream);
        Expr_MulBy.init(xstream);
        Expr_DivBy.init(xstream);
        Expr_ModBy.init(xstream);
        Expr_PostInc.init(xstream);
        Expr_PostDec.init(xstream);
        Expr_PreInc.init(xstream);
        Expr_PreDec.init(xstream);
        Expr_Not.init(xstream);
        Expr_Neg.init(xstream);
        Expr_Inv.init(xstream);
        Expr_Cast.init(xstream);
        Expr_AQString.init(xstream);
        Expr_AQInteger.init(xstream);
        Expr_AQKey.init(xstream);
        Expr_AQFloat.init(xstream);
        Func.init(xstream);
        Func_Func.init(xstream);
        FuncDec.init(xstream);
        FuncDec_FuncDec.init(xstream);
        GlobDef.init(xstream);
        GlobDef_GV.init(xstream);
        GlobDef_GF.init(xstream);
        GlobDef_GI.init(xstream);
        Handler.init(xstream);
        Handler_Handler.init(xstream);
        LModule.init(xstream);
        LModule_LModule.init(xstream);
        LSLScript.init(xstream);
        LSLScript_LSLScript.init(xstream);
        SourceContext.init(xstream);
        SourceContext_SourceContext.init(xstream);
        State.init(xstream);
        State_State.init(xstream);
        Statement.init(xstream);
        Statement_Compound.init(xstream);
        Statement_While.init(xstream);
        Statement_DoWhile.init(xstream);
        Statement_For.init(xstream);
        Statement_If.init(xstream);
        Statement_Decl.init(xstream);
        Statement_NullStmt.init(xstream);
        Statement_Return.init(xstream);
        Statement_StateChange.init(xstream);
        Statement_Do.init(xstream);
        Statement_Label.init(xstream);
        Statement_Jump.init(xstream);
        TextLocation.init(xstream);
        TextLocation_TextLocation.init(xstream);
        Var.init(xstream);
        Var_Var.init(xstream);
    }
}
