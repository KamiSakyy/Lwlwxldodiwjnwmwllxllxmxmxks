package v01;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final /* synthetic */ b[] v;

    static {
        b bVar = new b("CREATED_AT", 0);
        r = bVar;
        b bVar2 = new b("NAME", 1);
        s = bVar2;
        b bVar3 = new b("PUSHED_AT", 2);
        t = bVar3;
        b bVar4 = new b("STARGAZERS", 3);
        u = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, new b("UPDATED_AT", 4)};
        v = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) v.clone();
    }
}
