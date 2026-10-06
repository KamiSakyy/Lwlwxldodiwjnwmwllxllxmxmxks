package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class cv {
    public static final cv A;
    public static final cv B;
    public static final /* synthetic */ cv[] C;
    public static final bv Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final cv t;
    public static final cv u;
    public static final cv v;
    public static final cv w;
    public static final cv x;
    public static final cv y;
    public static final cv z;
    public final String r;

    static {
        cv cvVar = new cv("CONFUSED", 0, "CONFUSED");
        t = cvVar;
        cv cvVar2 = new cv("EYES", 1, "EYES");
        u = cvVar2;
        cv cvVar3 = new cv("HEART", 2, "HEART");
        v = cvVar3;
        cv cvVar4 = new cv("HOORAY", 3, "HOORAY");
        w = cvVar4;
        cv cvVar5 = new cv("LAUGH", 4, "LAUGH");
        x = cvVar5;
        cv cvVar6 = new cv("ROCKET", 5, "ROCKET");
        y = cvVar6;
        cv cvVar7 = new cv("THUMBS_DOWN", 6, "THUMBS_DOWN");
        z = cvVar7;
        cv cvVar8 = new cv("THUMBS_UP", 7, "THUMBS_UP");
        A = cvVar8;
        cv cvVar9 = new cv("UNKNOWN__", 8, "UNKNOWN__");
        B = cvVar9;
        cv[] cvVarArr = {cvVar, cvVar2, cvVar3, cvVar4, cvVar5, cvVar6, cvVar7, cvVar8, cvVar9};
        C = cvVarArr;
        D = v8.l0.t(cvVarArr);
        Companion = new bv();
        x61.l.r(new String[]{"CONFUSED", "EYES", "HEART", "HOORAY", "LAUGH", "ROCKET", "THUMBS_DOWN", "THUMBS_UP"});
        s = new aa.a0("ReactionContent");
    }

    public cv(String str, int i, String str2) {
        this.r = str2;
    }

    public static cv valueOf(String str) {
        return (cv) Enum.valueOf(cv.class, str);
    }

    public static cv[] values() {
        return (cv[]) C.clone();
    }
}
