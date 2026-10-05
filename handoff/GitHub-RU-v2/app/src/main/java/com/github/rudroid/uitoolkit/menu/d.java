package com.github.rudroid.uitoolkit.menu;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.rudroid.uitoolkit.text.o;
import d2.t;

/* loaded from: /home/user/work/p/classes3.dex */
public interface d {

    public static final class a implements d {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CollapsibleGroup(id=null, title=null, items=null)";
        }
    }

    public static final class b implements d {
        public final String a;
        public final long b;

        public b(String str, long j) {
            k71.k.g(str, "title");
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.a, bVar.a) && t.c(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            int i = t.l;
            return Long.hashCode(this.b) + hashCode;
        }

        public final String toString() {
            return x.i.g("Header(title=", this.a, ", textColor=", t.i(this.b), ")");
        }
    }

    public static final class c implements d {
        public final String a;
        public final String b;
        public final String c;
        public final com.github.rudroid.uitoolkit.text.l d;
        public final long e;
        public final long f;
        public final long g;
        public final int h;
        public final float i;
        public final String j;

        public c(String str, String str2, String str3, o oVar, long j, long j2, int i) {
            float f = ih.a.l;
            j2 = (i & 32) != 0 ? t.k : j2;
            long j3 = t.k;
            int i2 = (i & 128) != 0 ? 1 : 3;
            f = (i & 256) != 0 ? 0 : f;
            String str4 = str2 + " " + str3;
            k71.k.g(str2, "label");
            k71.k.g(str3, "value");
            k71.k.g(str4, "contentDescription");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = oVar;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = i2;
            this.i = f;
            this.j = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d) && t.c(this.e, cVar.e) && t.c(this.f, cVar.f) && t.c(this.g, cVar.g) && this.h == cVar.h && s3.f.b(this.i, cVar.i) && k71.k.b(this.j, cVar.j);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
            int i = t.l;
            return this.j.hashCode() + x.i.b(s0.b(this.h, x.i.c(x.i.c(x.i.c(hashCode, 31, this.e), 31, this.f), 31, this.g), 31), this.i, 31);
        }

        public final String toString() {
            String i = t.i(this.e);
            String i2 = t.i(this.f);
            String i3 = t.i(this.g);
            String c = s3.f.c(this.i);
            StringBuilder o = s0.o("InfoItem(id=", this.a, ", label=", this.b, ", value=");
            o.append(this.c);
            o.append(", compoundDrawables=");
            o.append(this.d);
            o.append(", iconColor=");
            f1.e.x(o, i, ", labelTextColor=", i2, ", valueTextColor=");
            s0.w(this.h, i3, ", valueMaxLines=", ", bottomPadding=", o);
            return x.i.k(o, c, ", contentDescription=", this.j, ")");
        }
    }

    public static final class e implements d {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -152338265;
        }

        public final String toString() {
            return "LargeSeparator";
        }
    }

    public static final class f implements d {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -984252163;
        }

        public final String toString() {
            return "SectionSeparator";
        }
    }

    public static final class g implements d {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -695461368;
        }

        public final String toString() {
            return "Separator";
        }
    }

    /* renamed from: com.github.rudroid.uitoolkit.menu.d$d, reason: collision with other inner class name */
    public static final class C0009d implements d {
        public final String a;
        public final String b;
        public final String c;
        public final com.github.rudroid.uitoolkit.text.l d;
        public final String e;
        public final long f;
        public final long g;
        public final long h;
        public final boolean i;
        public final boolean j;
        public final String k;
        public final int l;

        public C0009d(String str, String str2, String str3, com.github.rudroid.uitoolkit.text.l lVar, String str4, long j, long j2, long j3, boolean z, boolean z2, String str5, int i) {
            k71.k.g(str, "id");
            k71.k.g(str2, "title");
            k71.k.g(lVar, "compoundDrawables");
            k71.k.g(str4, "contentDescription");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = lVar;
            this.e = str4;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z;
            this.j = z2;
            this.k = str5;
            this.l = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0009d)) {
                return false;
            }
            C0009d c0009d = (C0009d) obj;
            return k71.k.b(this.a, c0009d.a) && k71.k.b(this.b, c0009d.b) && k71.k.b(this.c, c0009d.c) && k71.k.b(this.d, c0009d.d) && k71.k.b(this.e, c0009d.e) && t.c(this.f, c0009d.f) && t.c(this.g, c0009d.g) && t.c(this.h, c0009d.h) && this.i == c0009d.i && this.j == c0009d.j && k71.k.b(this.k, c0009d.k) && this.l == c0009d.l;
        }

        public final int hashCode() {
            int i = h1.i(this.a.hashCode() * 31, this.b, 31);
            String str = this.c;
            int i2 = h1.i((this.d.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31, this.e, 31);
            int i3 = t.l;
            int e = x.i.e(x.i.e(x.i.c(x.i.c(x.i.c(i2, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
            String str2 = this.k;
            return Integer.hashCode(this.l) + ((e + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String i = t.i(this.f);
            String i2 = t.i(this.g);
            String i3 = t.i(this.h);
            StringBuilder o = s0.o("Item(id=", this.a, ", title=", this.b, ", subtitle=");
            o.append(this.c);
            o.append(", compoundDrawables=");
            o.append(this.d);
            o.append(", contentDescription=");
            f1.e.x(o, this.e, ", titleTextColor=", i, ", subtitleTextColor=");
            f1.e.x(o, i2, ", iconColor=", i3, ", isEnabled=");
            m0.A(o, this.i, ", isLocked=", this.j, ", testTag=");
            o.append(this.k);
            o.append(", maxLines=");
            o.append(this.l);
            o.append(")");
            return o.toString();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public C0009d(java.lang.String r20, java.lang.String r21, java.lang.String r22, com.github.rudroid.uitoolkit.text.o r23, java.lang.String r24, long r25, long r27, long r29, boolean r31, boolean r32, int r33, int r34) {
            /*
                r19 = this;
                r0 = r34
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L9
                r6 = r2
                goto Lb
            L9:
                r6 = r22
            Lb:
                r1 = r0 & 8
                if (r1 == 0) goto L17
                r1 = 15
                com.github.rudroid.uitoolkit.text.o r1 = com.github.rudroid.uitoolkit.text.m.b(r2, r2, r2, r1)
                r7 = r1
                goto L19
            L17:
                r7 = r23
            L19:
                r1 = r0 & 16
                if (r1 == 0) goto L20
                r8 = r21
                goto L22
            L20:
                r8 = r24
            L22:
                r1 = r0 & 32
                if (r1 == 0) goto L2a
                long r3 = d2.t.k
                r9 = r3
                goto L2c
            L2a:
                r9 = r25
            L2c:
                r1 = r0 & 64
                if (r1 == 0) goto L34
                long r3 = d2.t.k
                r11 = r3
                goto L36
            L34:
                r11 = r27
            L36:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L3e
                long r3 = d2.t.k
                r13 = r3
                goto L40
            L3e:
                r13 = r29
            L40:
                r1 = r0 & 256(0x100, float:3.59E-43)
                r3 = 1
                if (r1 == 0) goto L47
                r15 = r3
                goto L49
            L47:
                r15 = r31
            L49:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L51
                r1 = 0
                r16 = r1
                goto L53
            L51:
                r16 = r32
            L53:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L5a
            L57:
                r17 = r2
                goto L5d
            L5a:
                java.lang.String r2 = "Selected new branch for PR"
                goto L57
            L5d:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L6a
                r18 = r3
                r4 = r20
                r5 = r21
                r3 = r19
                goto L72
            L6a:
                r18 = r33
                r3 = r19
                r4 = r20
                r5 = r21
            L72:
                r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.rudroid.uitoolkit.menu.d.C0009d.<init>(java.lang.String, java.lang.String, java.lang.String, com.github.rudroid.uitoolkit.text.o, java.lang.String, long, long, long, boolean, boolean, int, int):void");
        }
    }
}
