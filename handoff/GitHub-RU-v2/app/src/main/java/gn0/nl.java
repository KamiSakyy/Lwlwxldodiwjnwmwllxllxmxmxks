package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class nl {
    public static final ml Companion;
    public static final nl s;
    public static final nl t;
    public static final nl u;
    public static final /* synthetic */ nl[] v;
    public final String r;

    static {
        nl nlVar = new nl("MERGE", 0, "MERGE");
        s = nlVar;
        nl nlVar2 = new nl("REBASE", 1, "REBASE");
        t = nlVar2;
        nl nlVar3 = new nl("UNKNOWN__", 2, "UNKNOWN__");
        u = nlVar3;
        nl[] nlVarArr = {nlVar, nlVar2, nlVar3};
        v = nlVarArr;
        v8.l0.t(nlVarArr);
        Companion = new ml();
        sy.d0.o(new String[]{"MERGE", "REBASE"});
    }

    public nl(String str, int i, String str2) {
        this.r = str2;
    }

    public static nl valueOf(String str) {
        return (nl) Enum.valueOf(nl.class, str);
    }

    public static nl[] values() {
        return (nl[]) v.clone();
    }
}
