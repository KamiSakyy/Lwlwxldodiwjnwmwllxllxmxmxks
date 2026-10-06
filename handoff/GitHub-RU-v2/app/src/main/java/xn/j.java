package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final j r;
    public static final j s;
    public static final j t;
    public static final j u;
    public static final /* synthetic */ j[] v;

    static {
        j jVar = new j("LIGHTWEIGHT", 0);
        r = jVar;
        j jVar2 = new j("VERSATILE", 1);
        s = jVar2;
        j jVar3 = new j("POWERFUL", 2);
        t = jVar3;
        j jVar4 = new j("UNKNOWN", 3);
        u = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        v = jVarArr;
        v8.l0.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) v.clone();
    }
    public Object name() { return null; }
}
