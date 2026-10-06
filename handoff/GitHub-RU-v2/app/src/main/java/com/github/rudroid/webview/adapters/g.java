package com.github.rudroid.webview.adapters;

import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import x61.m;

/* loaded from: /home/user/work/p/classes3.dex */
public interface g {

    public static final class a implements g {
        public String a;
        public List b;
        public List c;
        public boolean d;

        public a(String str, List list, List list2, boolean z) {
            k.g(str, "id");
            this.a = str;
            this.b = list;
            this.c = list2;
            this.d = z;
        }

        @Override // com.github.rudroid.webview.adapters.g
        public final List a() {
            boolean z = this.d;
            List list = this.b;
            return z ? list : m.l0(list, this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + f1.e.c(this.c, f1.e.c(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "CollapsibleGroup(id=" + this.a + ", headerItems=" + this.b + ", collapsibleItems=" + this.c + ", isCollapsed=" + this.d + ")";
        }
    }

    public static final class b implements g {
        public String a;
        public ArrayList b;
        public ArrayList c;
        public boolean d;

        public b(String str, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            k.g(str, "id");
            this.a = str;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = z;
        }

        @Override // com.github.rudroid.webview.adapters.g
        public final List a() {
            boolean z = this.d;
            ArrayList arrayList = this.b;
            return z ? arrayList : m.l0(arrayList, h.a(this.c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.b(this.a, bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + no.a.b(this.c, no.a.b(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder p = m0.p("CollapsibleItem(id=", this.a, ", headerItems=", this.b, ", collapsibleGroup=");
            p.append(this.c);
            p.append(", isCollapsed=");
            p.append(this.d);
            p.append(")");
            return p.toString();
        }
    }

    public static final class c implements g {
        public zh.b a;

        public c(zh.b bVar) {
            k.g(bVar, "singleItem");
            this.a = bVar;
        }

        @Override // com.github.rudroid.webview.adapters.g
        public final List a() {
            return d0Shadow.n(this.a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && k.b(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SingleItem(singleItem=" + this.a + ")";
        }
    }

    List a();
}
