package wf;

import com.github.rudroid.common.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h<T> {
    public static final a Companion = new a();
    public int a;

    public static final class a {
    }

    public static final class b<T> extends h<T> {
        public Object b;
        public int c;
        public boolean d;

        public b(Object obj, boolean z, int i) {
            super(0);
            this.b = obj;
            this.c = i;
            this.d = z;
        }
    }

    public static final class c extends h<m0> {
    }

    public h(int i) {
        this.a = i;
    }
}
