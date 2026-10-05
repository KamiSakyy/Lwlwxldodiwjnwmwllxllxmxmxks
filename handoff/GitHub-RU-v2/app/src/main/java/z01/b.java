package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static final b r;
    public static final b s;
    public static final /* synthetic */ b[] t;

    static {
        b bVar = new b("Issue", 0);
        r = bVar;
        b bVar2 = new b("PullRequest", 1);
        s = bVar2;
        b[] bVarArr = {bVar, bVar2};
        t = bVarArr;
        v8.l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) t.clone();
    }
}
