package xn;

import com.github.service.copilot.SessionEventType$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 {
    public static final j3 A;
    public static final j3 B;
    public static final j3 C;
    public static final SessionEventType$Companion Companion;
    public static final j3 D;
    public static final j3 E;
    public static final j3 F;
    public static final j3 G;
    public static final j3 H;
    public static final j3 I;
    public static final j3 J;
    public static final j3 K;
    public static final /* synthetic */ j3[] L;
    public static final Object r;
    public static final j3 s;
    public static final j3 t;
    public static final j3 u;
    public static final j3 v;
    public static final j3 w;
    public static final j3 x;
    public static final j3 y;
    public static final j3 z;

    static {
        j3 j3Var = new j3("SESSION_REQUESTED", 0);
        s = j3Var;
        j3 j3Var2 = new j3("SESSION_START", 1);
        t = j3Var2;
        j3 j3Var3 = new j3("SESSION_RESUME", 2);
        j3 j3Var4 = new j3("SESSION_ERROR", 3);
        j3 j3Var5 = new j3("SESSION_IDLE", 4);
        j3 j3Var6 = new j3("SESSION_INFO", 5);
        u = j3Var6;
        j3 j3Var7 = new j3("SESSION_MODEL_CHANGE", 6);
        j3 j3Var8 = new j3("SESSION_IMPORT_LEGACY", 7);
        j3 j3Var9 = new j3("SESSION_HANDOFF", 8);
        j3 j3Var10 = new j3("SESSION_TRUNCATION", 9);
        j3 j3Var11 = new j3("SUBAGENT_STARTED", 10);
        v = j3Var11;
        j3 j3Var12 = new j3("USER_MESSAGE", 11);
        w = j3Var12;
        j3 j3Var13 = new j3("LOCAL_PENDING_USER_MESSAGE", 12);
        x = j3Var13;
        j3 j3Var14 = new j3("ASSISTANT_TURN_START", 13);
        j3 j3Var15 = new j3("ASSISTANT_INTENT", 14);
        j3 j3Var16 = new j3("ASSISTANT_MESSAGE", 15);
        y = j3Var16;
        j3 j3Var17 = new j3("ASSISTANT_TURN_END", 16);
        j3 j3Var18 = new j3("ASSISTANT_USAGE", 17);
        j3 j3Var19 = new j3("ABORT", 18);
        j3 j3Var20 = new j3("TOOL_USER_REQUESTED", 19);
        j3 j3Var21 = new j3("TOOL_EXECUTION_START", 20);
        z = j3Var21;
        j3 j3Var22 = new j3("TOOL_EXECUTION_PARTIAL_RESULT", 21);
        A = j3Var22;
        j3 j3Var23 = new j3("TOOL_EXECUTION_COMPLETE", 22);
        B = j3Var23;
        j3 j3Var24 = new j3("CUSTOM_AGENT_STARTED", 23);
        j3 j3Var25 = new j3("CUSTOM_AGENT_COMPLETED", 24);
        j3 j3Var26 = new j3("CUSTOM_AGENT_FAILED", 25);
        j3 j3Var27 = new j3("CUSTOM_AGENT_SELECTED", 26);
        j3 j3Var28 = new j3("HOOK_START", 27);
        j3 j3Var29 = new j3("HOOK_END", 28);
        j3 j3Var30 = new j3("SYSTEM_MESSAGE", 29);
        j3 j3Var31 = new j3("PERMISSION_REQUESTED", 30);
        C = j3Var31;
        j3 j3Var32 = new j3("PERMISSION_COMPLETED", 31);
        D = j3Var32;
        j3 j3Var33 = new j3("USER_INPUT_REQUESTED", 32);
        E = j3Var33;
        j3 j3Var34 = new j3("USER_INPUT_COMPLETED", 33);
        F = j3Var34;
        j3 j3Var35 = new j3("EXIT_PLAN_MODE_REQUESTED", 34);
        G = j3Var35;
        j3 j3Var36 = new j3("EXIT_PLAN_MODE_COMPLETED", 35);
        H = j3Var36;
        j3 j3Var37 = new j3("ELICITATION_REQUESTED", 36);
        I = j3Var37;
        j3 j3Var38 = new j3("ELICITATION_COMPLETED", 37);
        J = j3Var38;
        j3 j3Var39 = new j3("UNKNOWN", 38);
        K = j3Var39;
        j3[] j3VarArr = {j3Var, j3Var2, j3Var3, j3Var4, j3Var5, j3Var6, j3Var7, j3Var8, j3Var9, j3Var10, j3Var11, j3Var12, j3Var13, j3Var14, j3Var15, j3Var16, j3Var17, j3Var18, j3Var19, j3Var20, j3Var21, j3Var22, j3Var23, j3Var24, j3Var25, j3Var26, j3Var27, j3Var28, j3Var29, j3Var30, j3Var31, j3Var32, j3Var33, j3Var34, j3Var35, j3Var36, j3Var37, j3Var38, j3Var39};
        L = j3VarArr;
        v8.l0.t(j3VarArr);
        Companion = new SessionEventType$Companion();
        r = sy.w.s(w61.i.r, new wm.a(17));
    }

    public static j3 valueOf(String str) {
        return (j3) Enum.valueOf(j3.class, str);
    }

    public static j3[] values() {
        return (j3[]) L.clone();
    }
    public Object ordinal() { return null; }
}
