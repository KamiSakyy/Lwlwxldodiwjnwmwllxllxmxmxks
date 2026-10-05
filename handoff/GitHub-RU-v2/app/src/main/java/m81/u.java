package m81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class u {
    public static final u t;
    public static final u u;
    public static final u v;
    public static final u w;
    public static final /* synthetic */ u[] x;
    public static final /* synthetic */ d71.b y;
    public final char r;
    public final char s;

    static {
        u uVar = new u("OBJ", 0, '{', '}');
        t = uVar;
        u uVar2 = new u("LIST", 1, '[', ']');
        u = uVar2;
        u uVar3 = new u("MAP", 2, '{', '}');
        v = uVar3;
        u uVar4 = new u("POLY_OBJ", 3, '[', ']');
        w = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        x = uVarArr;
        y = l0.t(uVarArr);
    }

    public u(String str, int i, char c, char c2) {
        this.r = c;
        this.s = c2;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) x.clone();
    }
}
