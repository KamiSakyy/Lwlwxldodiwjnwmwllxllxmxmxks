package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fq {
    public static final eq Companion;
    public static final aa.a0 s;
    public static final fq t;
    public static final /* synthetic */ fq[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        fq fqVar = new fq("ADMIN", 0, "ADMIN");
        fq fqVar2 = new fq("MAINTAIN", 1, "MAINTAIN");
        fq fqVar3 = new fq("READ", 2, "READ");
        fq fqVar4 = new fq("TRIAGE", 3, "TRIAGE");
        fq fqVar5 = new fq("WRITE", 4, "WRITE");
        fq fqVar6 = new fq("UNKNOWN__", 5, "UNKNOWN__");
        t = fqVar6;
        fq[] fqVarArr = {fqVar, fqVar2, fqVar3, fqVar4, fqVar5, fqVar6};
        u = fqVarArr;
        v = v8.l0.t(fqVarArr);
        Companion = new eq();
        x61.l.r(new String[]{"ADMIN", "MAINTAIN", "READ", "TRIAGE", "WRITE"});
        s = new aa.a0("RepositoryPermission");
    }

    public fq(String str, int i, String str2) {
        this.r = str2;
    }

    public static fq valueOf(String str) {
        return (fq) Enum.valueOf(fq.class, str);
    }

    public static fq[] values() {
        return (fq[]) u.clone();
    }
    public Object ordinal() { return null; }
}
