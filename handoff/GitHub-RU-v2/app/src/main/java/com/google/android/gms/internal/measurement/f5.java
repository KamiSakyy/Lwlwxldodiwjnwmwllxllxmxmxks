package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f5 implements Cloneable {
    public g5 r;
    public g5 s;

    public f5(g5 g5Var) {
        this.r = g5Var;
        if (g5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.s = (g5) g5Var.o(4);
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String sb2 = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(sb2);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.s.e()) {
            return;
        }
        g5 g5Var = (g5) this.r.o(4);
        d6.c.a(g5Var.getClass()).d(g5Var, this.s);
        this.s = g5Var;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f5 clone() {
        f5 f5Var = (f5) this.r.o(5);
        f5Var.s = d();
        return f5Var;
    }

    public final g5 d() {
        if (!this.s.e()) {
            return this.s;
        }
        this.s.g();
        return this.s;
    }

    public final g5 e() {
        g5 d = d();
        d.getClass();
        boolean z = true;
        byte byteValue = ((Byte) d.o(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = d6.c.a(d.getClass()).b(d);
                d.o(2);
            }
        }
        if (z) {
            return d;
        }
        throw new zzoh("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void g(g5 g5Var) {
        g5 g5Var2 = this.r;
        if (g5Var2.equals(g5Var)) {
            return;
        }
        if (!this.s.e()) {
            g5 g5Var3 = (g5) g5Var2.o(4);
            d6.c.a(g5Var3.getClass()).d(g5Var3, this.s);
            this.s = g5Var3;
        }
        g5 g5Var4 = this.s;
        d6.c.a(g5Var4.getClass()).d(g5Var4, g5Var);
    }

    public final void h(byte[] bArr, int i, z4 z4Var) {
        if (!this.s.e()) {
            g5 g5Var = (g5) this.r.o(4);
            d6.c.a(g5Var.getClass()).d(g5Var, this.s);
            this.s = g5Var;
        }
        try {
            g6 a = d6.c.a(this.s.getClass());
            g5 g5Var2 = this.s;
            androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d();
            z4Var.getClass();
            a.f(g5Var2, bArr, 0, i, dVar);
        } catch (zzmr e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public f5(Object... a) {
    }
}
