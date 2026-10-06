package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class zm {
    public static final zm A;
    public static final zm B;
    public static final /* synthetic */ zm[] C;
    public static final ym Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final zm t;
    public static final zm u;
    public static final zm v;
    public static final zm w;
    public static final zm x;
    public static final zm y;
    public static final zm z;
    public String r;

    static {
        zm zmVar = new zm("CONFUSED", 0, "CONFUSED");
        t = zmVar;
        zm zmVar2 = new zm("EYES", 1, "EYES");
        u = zmVar2;
        zm zmVar3 = new zm("HEART", 2, "HEART");
        v = zmVar3;
        zm zmVar4 = new zm("HOORAY", 3, "HOORAY");
        w = zmVar4;
        zm zmVar5 = new zm("LAUGH", 4, "LAUGH");
        x = zmVar5;
        zm zmVar6 = new zm("ROCKET", 5, "ROCKET");
        y = zmVar6;
        zm zmVar7 = new zm("THUMBS_DOWN", 6, "THUMBS_DOWN");
        z = zmVar7;
        zm zmVar8 = new zm("THUMBS_UP", 7, "THUMBS_UP");
        A = zmVar8;
        zm zmVar9 = new zm("UNKNOWN__", 8, "UNKNOWN__");
        B = zmVar9;
        zm[] zmVarArr = {zmVar, zmVar2, zmVar3, zmVar4, zmVar5, zmVar6, zmVar7, zmVar8, zmVar9};
        C = zmVarArr;
        D = v8.l0.t(zmVarArr);
        Companion = new ym();
        x61.l.r(new String[]{"CONFUSED", "EYES", "HEART", "HOORAY", "LAUGH", "ROCKET", "THUMBS_DOWN", "THUMBS_UP"});
        s = new aa.a0("ReactionContent");
    }

    public zm(String str, int i, String str2) {
        this.r = str2;
    }

    public static zm valueOf(String str) {
        return (zm) Enum.valueOf(zm.class, str);
    }

    public static zm[] values() {
        return (zm[]) C.clone();
    }
}
