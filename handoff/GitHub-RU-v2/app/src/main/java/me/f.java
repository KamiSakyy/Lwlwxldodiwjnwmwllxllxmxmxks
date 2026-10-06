package me;

import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public int f29214a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f29215b;

        /* renamed from: c, reason: collision with root package name */
        public final List f29216c = rShadow.r;

        public a(int i, Object[] objArr) {
            this.f29214a = i;
            this.f29215b = objArr;
        }

        @Override // me.f
        public final f a() {
            return null;
        }

        @Override // me.f
        public final List b() {
            return this.f29216c;
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public String f29217a;

        /* renamed from: b, reason: collision with root package name */
        public List f29218b;

        public b(String str) {
            k.g(str, "value");
            this.f29217a = str;
            this.f29218b = rShadow.r;
        }

        @Override // me.f
        public final f a() {
            return null;
        }

        @Override // me.f
        public final List b() {
            return this.f29218b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.b(this.f29217a, bVar.f29217a) && this.f29218b.equals(bVar.f29218b);
        }

        public final int hashCode() {
            return f1.e.c(this.f29218b, this.f29217a.hashCode() * 31, 31);
        }

        public final String toString() {
            return f4Shadow.o("SimpleString(value=", this.f29217a, ", spansList=", ", customAccessibilityLabel=null)", this.f29218b);
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public int f29219a;

        /* renamed from: b, reason: collision with root package name */
        public final List f29220b = rShadow.r;

        public c(int i) {
            this.f29219a = i;
        }

        @Override // me.f
        public final f a() {
            return null;
        }

        @Override // me.f
        public final List b() {
            return this.f29220b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29219a == cVar.f29219a && this.f29220b.equals(cVar.f29220b);
        }

        public final int hashCode() {
            return f1.e.c(this.f29220b, Integer.hashCode(this.f29219a) * 31, 31);
        }

        public final String toString() {
            return f4Shadow.i(this.f29219a, "SimpleStringResource(resId=", ", spansList=", ", customAccessibilityLabel=null)", this.f29220b);
        }
    }

    public static final class e extends f {

        /* renamed from: a, reason: collision with root package name */
        public int f29225a;

        /* renamed from: b, reason: collision with root package name */
        public int f29226b;

        /* renamed from: c, reason: collision with root package name */
        public final List f29227c = rShadow.r;

        public e(int i, int i10) {
            this.f29225a = i;
            this.f29226b = i10;
        }

        @Override // me.f
        public final f a() {
            return null;
        }

        @Override // me.f
        public final List b() {
            return this.f29227c;
        }
    }

    /* renamed from: me.f$f, reason: collision with other inner class name */
    public static final class C0085f extends f {

        /* renamed from: a, reason: collision with root package name */
        public d f29228a;

        /* renamed from: b, reason: collision with root package name */
        public List f29229b;

        /* renamed from: c, reason: collision with root package name */
        public List f29230c;

        public C0085f(d dVar, List list, List list2, int i) {
            list2 = (i & 4) != 0 ? rShadow.r : list2;
            k.g(list2, "spansList");
            this.f29228a = dVar;
            this.f29229b = list;
            this.f29230c = list2;
        }

        @Override // me.f
        public final f a() {
            return null;
        }

        @Override // me.f
        public final List b() {
            return this.f29230c;
        }
    }

    public abstract f a();

    public abstract List b();

    public static final class d extends f {

        /* renamed from: a, reason: collision with root package name */
        public int f29221a;

        /* renamed from: b, reason: collision with root package name */
        public Object[] f29222b;

        /* renamed from: c, reason: collision with root package name */
        public List f29223c;

        /* renamed from: d, reason: collision with root package name */
        public f f29224d;

        public d(int i, Object[] objArr, List list, d dVar) {
            k.g(list, "spansList");
            this.f29221a = i;
            this.f29222b = objArr;
            this.f29223c = list;
            this.f29224d = dVar;
        }

        @Override // me.f
        public final f a() {
            return this.f29224d;
        }

        @Override // me.f
        public final List b() {
            return this.f29223c;
        }

        public /* synthetic */ d(int i, Object[] objArr, List list, int i10) {
            this(i, objArr, (i10 & 4) != 0 ? rShadow.r : list, (d) null);
        }
    }
}
