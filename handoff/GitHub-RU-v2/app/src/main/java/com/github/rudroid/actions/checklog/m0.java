package com.github.rudroid.actions.checklog;

import jo.f4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class m0 {

    public static final class a extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4833a = new a();
    }

    public static final class b extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f4834a;

        /* renamed from: b, reason: collision with root package name */
        public final pi.i f4835b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4836c;

        public b(k0 k0Var, pi.i iVar, boolean z10) {
            this.f4834a = k0Var;
            this.f4835b = iVar;
            this.f4836c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4834a == bVar.f4834a && this.f4835b == bVar.f4835b && this.f4836c == bVar.f4836c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4836c) + ((this.f4835b.hashCode() + (this.f4834a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ColorBasic(target=");
            sb2.append(this.f4834a);
            sb2.append(", color=");
            sb2.append(this.f4835b);
            sb2.append(", bright=");
            return f4.s(sb2, this.f4836c, ")");
        }
    }

    public static final class c extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f4837a;

        /* renamed from: b, reason: collision with root package name */
        public final byte f4838b;

        /* renamed from: c, reason: collision with root package name */
        public final byte f4839c;

        /* renamed from: d, reason: collision with root package name */
        public final byte f4840d;

        public c(k0 k0Var, byte b10, byte b11, byte b12) {
            this.f4837a = k0Var;
            this.f4838b = b10;
            this.f4839c = b11;
            this.f4840d = b12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4837a == cVar.f4837a && this.f4838b == cVar.f4838b && this.f4839c == cVar.f4839c && this.f4840d == cVar.f4840d;
        }

        public final int hashCode() {
            return Byte.hashCode(this.f4840d) + ((Byte.hashCode(this.f4839c) + ((Byte.hashCode(this.f4838b) + (this.f4837a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            String a10 = w61.r.a(this.f4838b);
            String a11 = w61.r.a(this.f4839c);
            String a12 = w61.r.a(this.f4840d);
            StringBuilder sb2 = new StringBuilder("ColorRGB(target=");
            sb2.append(this.f4837a);
            sb2.append(", r=");
            sb2.append(a10);
            sb2.append(", g=");
            return x.i.k(sb2, a11, ", b=", a12, ")");
        }
    }

    public static final class d extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f4841a = new d();
    }

    public static final class e extends m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4842a = new e();
    }
}
