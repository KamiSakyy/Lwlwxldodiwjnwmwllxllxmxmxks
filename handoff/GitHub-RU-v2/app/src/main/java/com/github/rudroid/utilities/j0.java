package com.github.rudroid.utilities;

/* loaded from: /home/user/work/p/classes3.dex */
public class j0<T> {
    public Object a;
    public boolean b;

    public j0(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
