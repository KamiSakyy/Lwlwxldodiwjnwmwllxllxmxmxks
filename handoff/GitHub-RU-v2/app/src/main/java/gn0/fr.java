package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fr {
    public static final er Companion;
    public static final fr s;
    public static final fr t;
    public static final fr u;
    public static final fr v;
    public static final fr w;
    public static final fr x;
    public static final /* synthetic */ fr[] y;
    public static final /* synthetic */ d71.b z;
    public String r;

    static {
        fr frVar = new fr("CREATED_AT", 0, "CREATED_AT");
        s = frVar;
        fr frVar2 = new fr("NAME", 1, "NAME");
        t = frVar2;
        fr frVar3 = new fr("PUSHED_AT", 2, "PUSHED_AT");
        u = frVar3;
        fr frVar4 = new fr("STARGAZERS", 3, "STARGAZERS");
        v = frVar4;
        fr frVar5 = new fr("UPDATED_AT", 4, "UPDATED_AT");
        w = frVar5;
        fr frVar6 = new fr("UNKNOWN__", 5, "UNKNOWN__");
        x = frVar6;
        fr[] frVarArr = {frVar, frVar2, frVar3, frVar4, frVar5, frVar6};
        y = frVarArr;
        z = v8.l0.t(frVarArr);
        Companion = new er();
        sy.d0Shadow.o(new String[]{"CREATED_AT", "NAME", "PUSHED_AT", "STARGAZERS", "UPDATED_AT"});
    }

    public fr(String str, int i, String str2) {
        this.r = str2;
    }

    public static fr valueOf(String str) {
        return (fr) Enum.valueOf(fr.class, str);
    }

    public static fr[] values() {
        return (fr[]) y.clone();
    }
}
