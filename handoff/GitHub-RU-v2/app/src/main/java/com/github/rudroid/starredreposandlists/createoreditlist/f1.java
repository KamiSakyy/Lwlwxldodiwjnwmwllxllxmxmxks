package com.github.rudroid.starredreposandlists.createoreditlist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class f1 {
    public static final f1 r;
    public static final f1 s;
    public static final f1 t;
    public static final f1 u;
    public static final f1 v;
    public static final /* synthetic */ f1[] w;

    static {
        f1 f1Var = new f1("LOADING", 0);
        r = f1Var;
        f1 f1Var2 = new f1("LOADED", 1);
        s = f1Var2;
        f1 f1Var3 = new f1("INVALID", 2);
        t = f1Var3;
        f1 f1Var4 = new f1("SAVING", 3);
        u = f1Var4;
        f1 f1Var5 = new f1("SAVED", 4);
        v = f1Var5;
        f1[] f1VarArr = {f1Var, f1Var2, f1Var3, f1Var4, f1Var5};
        w = f1VarArr;
        v8.l0.t(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) w.clone();
    }















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g1 {
        public g1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i1 {
        public i1() {
        }
    }
}
