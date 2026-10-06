package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bo {
    public static final bo A;
    public static final bo B;
    public static final /* synthetic */ bo[] C;
    public static final ao Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final bo t;
    public static final bo u;
    public static final bo v;
    public static final bo w;
    public static final bo x;
    public static final bo y;
    public static final bo z;
    public String r;

    static {
        bo boVar = new bo("CONFUSED", 0, "CONFUSED");
        t = boVar;
        bo boVar2 = new bo("EYES", 1, "EYES");
        u = boVar2;
        bo boVar3 = new bo("HEART", 2, "HEART");
        v = boVar3;
        bo boVar4 = new bo("HOORAY", 3, "HOORAY");
        w = boVar4;
        bo boVar5 = new bo("LAUGH", 4, "LAUGH");
        x = boVar5;
        bo boVar6 = new bo("ROCKET", 5, "ROCKET");
        y = boVar6;
        bo boVar7 = new bo("THUMBS_DOWN", 6, "THUMBS_DOWN");
        z = boVar7;
        bo boVar8 = new bo("THUMBS_UP", 7, "THUMBS_UP");
        A = boVar8;
        bo boVar9 = new bo("UNKNOWN__", 8, "UNKNOWN__");
        B = boVar9;
        bo[] boVarArr = {boVar, boVar2, boVar3, boVar4, boVar5, boVar6, boVar7, boVar8, boVar9};
        C = boVarArr;
        D = v8.l0.t(boVarArr);
        Companion = new ao();
        x61.l.r(new String[]{"CONFUSED", "EYES", "HEART", "HOORAY", "LAUGH", "ROCKET", "THUMBS_DOWN", "THUMBS_UP"});
        s = new aa.a0("ReactionContent");
    }

    public bo(String str, int i, String str2) {
        this.r = str2;
    }

    public static bo valueOf(String str) {
        return (bo) Enum.valueOf(bo.class, str);
    }

    public static bo[] values() {
        return (bo[]) C.clone();
    }
}
