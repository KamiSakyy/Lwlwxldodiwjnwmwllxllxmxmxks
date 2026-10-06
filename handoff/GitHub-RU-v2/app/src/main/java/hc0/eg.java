package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class eg {
    public static final eg A;
    public static final eg B;
    public static final eg C;
    public static final dg Companion;
    public static final eg D;
    public static final eg E;
    public static final eg F;
    public static final eg G;
    public static final eg H;
    public static final eg I;
    public static final eg J;
    public static final eg K;
    public static final eg L;
    public static final eg M;
    public static final /* synthetic */ eg[] N;
    public static final /* synthetic */ d71.b O;
    public static final eg s;
    public static final eg t;
    public static final eg u;
    public static final eg v;
    public static final eg w;
    public static final eg x;
    public static final eg y;
    public static final eg z;
    public final String r;

    static {
        eg egVar = new eg("ASSIGNED", 0, "ASSIGNED");
        s = egVar;
        eg egVar2 = new eg("AWESOME", 1, "AWESOME");
        t = egVar2;
        eg egVar3 = new eg("CLOSED", 2, "CLOSED");
        u = egVar3;
        eg egVar4 = new eg("CREATED", 3, "CREATED");
        v = egVar4;
        eg egVar5 = new eg("DISMISSED", 4, "DISMISSED");
        w = egVar5;
        eg egVar6 = new eg("DISPLAYED", 5, "DISPLAYED");
        x = egVar6;
        eg egVar7 = new eg("DONE", 6, "DONE");
        y = egVar7;
        eg egVar8 = new eg("FEED", 7, "FEED");
        z = egVar8;
        eg egVar9 = new eg("MENTIONED", 8, "MENTIONED");
        A = egVar9;
        eg egVar10 = new eg("OPEN", 9, "OPEN");
        B = egVar10;
        eg egVar11 = new eg("OPENED", 10, "OPENED");
        C = egVar11;
        eg egVar12 = new eg("READ", 11, "READ");
        D = egVar12;
        eg egVar13 = new eg("REVIEW_REQUESTED", 12, "REVIEW_REQUESTED");
        E = egVar13;
        eg egVar14 = new eg("SAVE", 13, "SAVE");
        F = egVar14;
        eg egVar15 = new eg("SUBSCRIBE", 14, "SUBSCRIBE");
        G = egVar15;
        eg egVar16 = new eg("TRENDING", 15, "TRENDING");
        H = egVar16;
        eg egVar17 = new eg("UNDONE", 16, "UNDONE");
        I = egVar17;
        eg egVar18 = new eg("UNREAD", 17, "UNREAD");
        J = egVar18;
        eg egVar19 = new eg("UNSAVE", 18, "UNSAVE");
        K = egVar19;
        eg egVar20 = new eg("UNSUBSCRIBE", 19, "UNSUBSCRIBE");
        L = egVar20;
        eg egVar21 = new eg("UNKNOWN__", 20, "UNKNOWN__");
        M = egVar21;
        eg[] egVarArr = {egVar, egVar2, egVar3, egVar4, egVar5, egVar6, egVar7, egVar8, egVar9, egVar10, egVar11, egVar12, egVar13, egVar14, egVar15, egVar16, egVar17, egVar18, egVar19, egVar20, egVar21};
        N = egVarArr;
        O = v8.l0.t(egVarArr);
        Companion = new dg();
        sy.d0.o(new String[]{"ASSIGNED", "AWESOME", "CLOSED", "CREATED", "DISMISSED", "DISPLAYED", "DONE", "FEED", "MENTIONED", "OPEN", "OPENED", "READ", "REVIEW_REQUESTED", "SAVE", "SUBSCRIBE", "TRENDING", "UNDONE", "UNREAD", "UNSAVE", "UNSUBSCRIBE"});
    }

    public eg(String str, int i, String str2) {
        this.r = str2;
    }

    public static eg valueOf(String str) {
        return (eg) Enum.valueOf(eg.class, str);
    }

    public static eg[] values() {
        return (eg[]) N.clone();
    }
}
