package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class eh {
    public static final eh A;
    public static final eh B;
    public static final eh C;
    public static final dh Companion;
    public static final eh D;
    public static final eh E;
    public static final eh F;
    public static final eh G;
    public static final eh H;
    public static final eh I;
    public static final eh J;
    public static final eh K;
    public static final eh L;
    public static final eh M;
    public static final /* synthetic */ eh[] N;
    public static final /* synthetic */ d71.b O;
    public static final eh s;
    public static final eh t;
    public static final eh u;
    public static final eh v;
    public static final eh w;
    public static final eh x;
    public static final eh y;
    public static final eh z;
    public String r;

    static {
        eh ehVar = new eh("ASSIGNED", 0, "ASSIGNED");
        s = ehVar;
        eh ehVar2 = new eh("AWESOME", 1, "AWESOME");
        t = ehVar2;
        eh ehVar3 = new eh("CLOSED", 2, "CLOSED");
        u = ehVar3;
        eh ehVar4 = new eh("CREATED", 3, "CREATED");
        v = ehVar4;
        eh ehVar5 = new eh("DISMISSED", 4, "DISMISSED");
        w = ehVar5;
        eh ehVar6 = new eh("DISPLAYED", 5, "DISPLAYED");
        x = ehVar6;
        eh ehVar7 = new eh("DONE", 6, "DONE");
        y = ehVar7;
        eh ehVar8 = new eh("FEED", 7, "FEED");
        z = ehVar8;
        eh ehVar9 = new eh("MENTIONED", 8, "MENTIONED");
        A = ehVar9;
        eh ehVar10 = new eh("OPEN", 9, "OPEN");
        B = ehVar10;
        eh ehVar11 = new eh("OPENED", 10, "OPENED");
        C = ehVar11;
        eh ehVar12 = new eh("READ", 11, "READ");
        D = ehVar12;
        eh ehVar13 = new eh("REVIEW_REQUESTED", 12, "REVIEW_REQUESTED");
        E = ehVar13;
        eh ehVar14 = new eh("SAVE", 13, "SAVE");
        F = ehVar14;
        eh ehVar15 = new eh("SUBSCRIBE", 14, "SUBSCRIBE");
        G = ehVar15;
        eh ehVar16 = new eh("TRENDING", 15, "TRENDING");
        H = ehVar16;
        eh ehVar17 = new eh("UNDONE", 16, "UNDONE");
        I = ehVar17;
        eh ehVar18 = new eh("UNREAD", 17, "UNREAD");
        J = ehVar18;
        eh ehVar19 = new eh("UNSAVE", 18, "UNSAVE");
        K = ehVar19;
        eh ehVar20 = new eh("UNSUBSCRIBE", 19, "UNSUBSCRIBE");
        L = ehVar20;
        eh ehVar21 = new eh("UNKNOWN__", 20, "UNKNOWN__");
        M = ehVar21;
        eh[] ehVarArr = {ehVar, ehVar2, ehVar3, ehVar4, ehVar5, ehVar6, ehVar7, ehVar8, ehVar9, ehVar10, ehVar11, ehVar12, ehVar13, ehVar14, ehVar15, ehVar16, ehVar17, ehVar18, ehVar19, ehVar20, ehVar21};
        N = ehVarArr;
        O = v8.l0.t(ehVarArr);
        Companion = new dh();
        sy.d0.o(new String[]{"ASSIGNED", "AWESOME", "CLOSED", "CREATED", "DISMISSED", "DISPLAYED", "DONE", "FEED", "MENTIONED", "OPEN", "OPENED", "READ", "REVIEW_REQUESTED", "SAVE", "SUBSCRIBE", "TRENDING", "UNDONE", "UNREAD", "UNSAVE", "UNSUBSCRIBE"});
    }

    public eh(String str, int i, String str2) {
        this.r = str2;
    }

    public static eh valueOf(String str) {
        return (eh) Enum.valueOf(eh.class, str);
    }

    public static eh[] values() {
        return (eh[]) N.clone();
    }
}
