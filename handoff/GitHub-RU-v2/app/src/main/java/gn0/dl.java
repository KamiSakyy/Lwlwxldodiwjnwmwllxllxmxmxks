package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class dl {
    public static final cl Companion;
    public static final aa.a0 s;
    public static final dl t;
    public static final /* synthetic */ dl[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        dl dlVar = new dl("CLOSED", 0, "CLOSED");
        dl dlVar2 = new dl("OPEN", 1, "OPEN");
        dl dlVar3 = new dl("UNKNOWN__", 2, "UNKNOWN__");
        t = dlVar3;
        dl[] dlVarArr = {dlVar, dlVar2, dlVar3};
        u = dlVarArr;
        v = v8.l0.t(dlVarArr);
        Companion = new cl();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("ProjectState");
    }

    public dl(String str, int i, String str2) {
        this.r = str2;
    }

    public static dl valueOf(String str) {
        return (dl) Enum.valueOf(dl.class, str);
    }

    public static dl[] values() {
        return (dl[]) u.clone();
    }
}
