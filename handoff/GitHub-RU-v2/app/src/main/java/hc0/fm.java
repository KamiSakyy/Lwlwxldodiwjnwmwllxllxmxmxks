package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fm {
    public static final em Companion;
    public static final aa.a0 s;
    public static final fm t;
    public static final fm u;
    public static final fm v;
    public static final /* synthetic */ fm[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        fm fmVar = new fm("CLOSED", 0, "CLOSED");
        t = fmVar;
        fm fmVar2 = new fm("MERGED", 1, "MERGED");
        fm fmVar3 = new fm("OPEN", 2, "OPEN");
        u = fmVar3;
        fm fmVar4 = new fm("UNKNOWN__", 3, "UNKNOWN__");
        v = fmVar4;
        fm[] fmVarArr = {fmVar, fmVar2, fmVar3, fmVar4};
        w = fmVarArr;
        x = v8.l0.t(fmVarArr);
        Companion = new em();
        x61.l.r(new String[]{"CLOSED", "MERGED", "OPEN"});
        s = new aa.a0("PullRequestState");
    }

    public fm(String str, int i, String str2) {
        this.r = str2;
    }

    public static fm valueOf(String str) {
        return (fm) Enum.valueOf(fm.class, str);
    }

    public static fm[] values() {
        return (fm[]) w.clone();
    }
}
