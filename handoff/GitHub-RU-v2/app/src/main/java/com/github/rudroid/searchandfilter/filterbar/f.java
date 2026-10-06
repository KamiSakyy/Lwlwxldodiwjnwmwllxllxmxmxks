package com.github.rudroid.searchandfilter.filterbar;

import com.github.rudroid.searchandfilter.filterbar.d;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final a Companion = new a();
    public final int a;

    public static final class a {
    }

    public static final class c extends f {
    }

    public f(int i) {
        this.a = i;
    }

    public static abstract class b extends f {
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final com.github.rudroid.uitoolkit.tooltip.h f;

        public static final class a extends b {
            public final j71.a g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, boolean z, String str3, j71.a aVar) {
                super(3, str2, z, false, str3, null);
                k71.k.g(str, "id");
                k71.k.g(str2, "label");
                k71.k.g(aVar, "onClick");
                this.g = aVar;
            }
        }

        public static final class e extends b {
            public final j71.a g;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public e(String str, String str2, boolean z, boolean z2, String str3, j71.a aVar, int i) {
                super(0, str2, z, z2, str3, null);
                z2 = (i & 8) != 0 ? false : z2;
                k71.k.g(str, "id");
                k71.k.g(aVar, "onClick");
                this.g = aVar;
            }
        }

        public b(int i, String str, boolean z, boolean z2, String str2, com.github.rudroid.uitoolkit.tooltip.h hVar) {
            super(i);
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = str2;
            this.f = hVar;
        }

        public static final class c extends b {
            public final j71.a g;
            public final com.github.rudroid.searchandfilter.filterbar.d h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, String str2, boolean z, String str3, boolean z2, com.github.rudroid.uitoolkit.tooltip.h hVar, j71.a aVar, com.github.rudroid.searchandfilter.filterbar.d dVar) {
                super(2, str2, z, z2, str3, hVar);
                k71.k.g(str, "id");
                k71.k.g(str2, "label");
                k71.k.g(aVar, "onClick");
                this.g = aVar;
                this.h = dVar;
            }

            public /* synthetic */ c(String str, String str2, boolean z, String str3, boolean z2, j71.a aVar, com.github.rudroid.searchandfilter.filterbar.d dVar, int i) {
                this(str, str2, z, str3, z2, (com.github.rudroid.uitoolkit.tooltip.h) null, aVar, (i & 128) != 0 ? null : dVar);
            }
        }

        public static final class d extends b {
            public final yg.j g;
            public final d.b h;
            public final j71.a i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, String str2, boolean z, String str3, yg.j jVar, d.b bVar, com.github.rudroid.uitoolkit.tooltip.h hVar, j71.a aVar) {
                super(5, str2, z, false, str3, hVar);
                k71.k.g(str, "id");
                k71.k.g(str2, "label");
                this.g = jVar;
                this.h = bVar;
                this.i = aVar;
            }

            public /* synthetic */ d(String str, String str2, boolean z, String str3, d.b bVar, com.github.rudroid.uitoolkit.tooltip.h hVar, j71.a aVar) {
                this(str, str2, z, str3, new yg.j(null, null, null, null), bVar, hVar, aVar);
            }
        }

        /* renamed from: com.github.rudroid.searchandfilter.filterbar.f$b$b, reason: collision with other inner class name */
        public static final class C0002b<T> extends b {
            public final List g;
            public final a.C0003a h;
            public final j71.c i;

            /* renamed from: com.github.rudroid.searchandfilter.filterbar.f$b$b$a */
            public interface a {

                /* renamed from: com.github.rudroid.searchandfilter.filterbar.f$b$b$a$a, reason: collision with other inner class name */
                public static final class C0003a<T> implements a {
                    public final Object a;
                    public final String b;

                    public C0003a(Object obj, String str) {
                        this.a = obj;
                        this.b = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0003a)) {
                            return false;
                        }
                        C0003a c0003a = (C0003a) obj;
                        return k71.k.b(this.a, c0003a.a) && k71.k.b(this.b, c0003a.b);
                    }

                    public final int hashCode() {
                        Object obj = this.a;
                        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
                    }

                    public final String toString() {
                        return "Option(item=" + this.a + ", label=" + this.b + ")";
                    }
                }

                /* renamed from: com.github.rudroid.searchandfilter.filterbar.f$b$b$a$b, reason: collision with other inner class name */
                public static final class C0004b implements a {
                    public static final C0004b a = new C0004b();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0002b(String str, String str2, List list, a.C0003a c0003a, boolean z, String str3, boolean z2, j71.c cVar) {
                super(1, str2, z, z2, str3, null);
                k71.k.g(str, "id");
                k71.k.g(cVar, "onOptionSelected");
                this.g = list;
                this.h = c0003a;
                this.i = cVar;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C0002b(String str, List list, a.C0003a c0003a, boolean z, String str2, boolean z2, j71.c cVar) {
                this(str, c0003a.b, list, c0003a, z, str2, z2, cVar);
                k71.k.g(str, "id");
                k71.k.g(cVar, "onOptionSelected");
            }
        }
    }
}
