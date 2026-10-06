package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class hn {
    public static final gn Companion;
    public static final aa.a0 s;
    public static final hn t;
    public static final hn u;
    public static final hn v;
    public static final /* synthetic */ hn[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        hn hnVar = new hn("CLOSED", 0, "CLOSED");
        t = hnVar;
        hn hnVar2 = new hn("MERGED", 1, "MERGED");
        hn hnVar3 = new hn("OPEN", 2, "OPEN");
        u = hnVar3;
        hn hnVar4 = new hn("UNKNOWN__", 3, "UNKNOWN__");
        v = hnVar4;
        hn[] hnVarArr = {hnVar, hnVar2, hnVar3, hnVar4};
        w = hnVarArr;
        x = v8.l0.t(hnVarArr);
        Companion = new gn();
        x61.l.r(new String[]{"CLOSED", "MERGED", "OPEN"});
        s = new aa.a0("PullRequestState");
    }

    public hn(String str, int i, String str2) {
        this.r = str2;
    }

    public static hn valueOf(String str) {
        return (hn) Enum.valueOf(hn.class, str);
    }

    public static hn[] values() {
        return (hn[]) w.clone();
    }
    public Object ordinal() { return null; }
}
