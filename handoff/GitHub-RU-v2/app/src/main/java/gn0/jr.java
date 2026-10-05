package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class jr {
    public static final ir Companion;
    public static final aa.a0 s;
    public static final jr t;
    public static final /* synthetic */ jr[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        jr jrVar = new jr("ADMIN", 0, "ADMIN");
        jr jrVar2 = new jr("MAINTAIN", 1, "MAINTAIN");
        jr jrVar3 = new jr("READ", 2, "READ");
        jr jrVar4 = new jr("TRIAGE", 3, "TRIAGE");
        jr jrVar5 = new jr("WRITE", 4, "WRITE");
        jr jrVar6 = new jr("UNKNOWN__", 5, "UNKNOWN__");
        t = jrVar6;
        jr[] jrVarArr = {jrVar, jrVar2, jrVar3, jrVar4, jrVar5, jrVar6};
        u = jrVarArr;
        v = v8.l0.t(jrVarArr);
        Companion = new ir();
        x61.l.r(new String[]{"ADMIN", "MAINTAIN", "READ", "TRIAGE", "WRITE"});
        s = new aa.a0("RepositoryPermission");
    }

    public jr(String str, int i, String str2) {
        this.r = str2;
    }

    public static jr valueOf(String str) {
        return (jr) Enum.valueOf(jr.class, str);
    }

    public static jr[] values() {
        return (jr[]) u.clone();
    }
}
