package m81;

import a0.s0;
import b21.v;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.n4;
import k81.c1;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r extends d5 {
    public final n4 a;
    public final l81.c b;
    public final u c;
    public final r[] d;
    public final b21.l e;
    public final l81.h f;
    public boolean g;
    public String h;
    public String i;

    public r(n4 n4Var, l81.c cVar, u uVar, r[] rVarArr) {
        k71.k.g(n4Var, "composer");
        this.a = n4Var;
        this.b = cVar;
        this.c = uVar;
        this.d = rVarArr;
        this.e = cVar.b;
        this.f = cVar.a;
        int ordinal = uVar.ordinal();
        if (rVarArr != null) {
            r rVar = rVarArr[ordinal];
            if (rVar == null && rVar == this) {
                return;
            }
            rVarArr[ordinal] = this;
        }
    }

    public final void D(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        int ordinal = this.c.ordinal();
        n4 n4Var = this.a;
        boolean z = true;
        if (ordinal == 1) {
            if (!n4Var.r) {
                n4Var.h(',');
            }
            n4Var.f();
            return;
        }
        if (ordinal == 2) {
            if (n4Var.r) {
                this.g = true;
                n4Var.f();
                return;
            }
            if (i % 2 == 0) {
                n4Var.h(',');
                n4Var.f();
            } else {
                n4Var.h(':');
                n4Var.o();
                z = false;
            }
            this.g = z;
            return;
        }
        if (ordinal != 3) {
            if (!n4Var.r) {
                n4Var.h(',');
            }
            n4Var.f();
            i.n(serialDescriptor, this.b);
            p(serialDescriptor.g(i));
            n4Var.h(':');
            n4Var.o();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            n4Var.h(',');
            n4Var.o();
            this.g = false;
        }
    }

    public final void H(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "serializer");
        if (obj != null || this.f.d) {
            super.H(serialDescriptor, i, kSerializer, obj);
        }
    }

    public final void L(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        n4 n4Var = this.a;
        n4Var.getClass();
        n4Var.r = false;
        n4Var.h(this.c.s);
    }

    public final boolean X(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return this.f.a;
    }

    public final b21.l a() {
        return this.e;
    }

    public final d5 b(SerialDescriptor serialDescriptor) {
        r rVar;
        k71.k.g(serialDescriptor, "descriptor");
        l81.c cVar = this.b;
        u p = i.p(serialDescriptor, cVar);
        char c = p.r;
        n4 n4Var = this.a;
        n4Var.h(c);
        n4Var.r = true;
        String str = this.h;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = serialDescriptor.a();
            }
            n4Var.f();
            p(str);
            n4Var.h(':');
            p(str2);
            this.h = null;
            this.i = null;
        }
        if (this.c == p) {
            return this;
        }
        r[] rVarArr = this.d;
        return (rVarArr == null || (rVar = rVarArr[p.ordinal()]) == null) ? new r(n4Var, cVar, p, rVarArr) : rVar;
    }

    public final void c() {
        this.a.k("null");
    }

    public final void d(double d) {
        boolean z = this.g;
        n4 n4Var = this.a;
        if (z) {
            p(String.valueOf(d));
        } else {
            ((v) n4Var.s).B(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw i.b(Double.valueOf(d), ((v) n4Var.s).toString());
        }
    }

    public final void e(short s) {
        if (this.g) {
            p(String.valueOf((int) s));
        } else {
            this.a.l(s);
        }
    }

    public final void f(byte b) {
        if (this.g) {
            p(String.valueOf((int) b));
        } else {
            this.a.g(b);
        }
    }

    public final void g(boolean z) {
        if (this.g) {
            p(String.valueOf(z));
        } else {
            ((v) this.a.s).B(String.valueOf(z));
        }
    }

    public final void h(float f) {
        boolean z = this.g;
        n4 n4Var = this.a;
        if (z) {
            p(String.valueOf(f));
        } else {
            ((v) n4Var.s).B(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw i.b(Float.valueOf(f), ((v) n4Var.s).toString());
        }
    }

    public final void i(char c) {
        p(String.valueOf(c));
    }

    public final void k(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "enumDescriptor");
        p(serialDescriptor.g(i));
    }

    public final void l(int i) {
        if (this.g) {
            p(String.valueOf(i));
        } else {
            this.a.i(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Encoder m(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        boolean a = s.a(serialDescriptor);
        u uVar = this.c;
        l81.c cVar = this.b;
        n4 n4Var = this.a;
        if (a) {
            if (!(n4Var instanceof f)) {
                n4Var = new f((v) n4Var.s, this.g);
            }
            return new r(n4Var, cVar, uVar, null);
        }
        if (serialDescriptor.h() && serialDescriptor.equals(l81.j.a)) {
            if (!(n4Var instanceof e)) {
                n4Var = new e((v) n4Var.s, this.g);
            }
            return new r(n4Var, cVar, uVar, null);
        }
        if (this.h != null) {
            this.i = serialDescriptor.a();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        if (k71.k.b(r1, i81.k.h) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 != l81.a.r) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(KSerializer kSerializer, Object obj) {
        String h;
        k71.k.g(kSerializer, "serializer");
        l81.c cVar = this.b;
        l81.a aVar = cVar.a.i;
        boolean z = kSerializer instanceof k81.b;
        if (!z) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    y9.a e = kSerializer.getDescriptor().e();
                    if (!k71.k.b(e, i81.k.e)) {
                    }
                    h = i.h(kSerializer.getDescriptor(), cVar);
                } else if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            h = null;
        }
        if (z) {
            k81.b bVar = (k81.b) kSerializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + bVar.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            KSerializer s = b41.b.s(bVar, this, obj);
            if (h != null) {
                if (kSerializer instanceof g81.d) {
                    SerialDescriptor descriptor = s.getDescriptor();
                    k71.k.g(descriptor, "<this>");
                    if (c1.b(descriptor).contains(h)) {
                        StringBuilder o = s0.o("Sealed class '", s.getDescriptor().a(), "' cannot be serialized as base class '", ((g81.d) kSerializer).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                        o.append(h);
                        o.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        throw new IllegalStateException(o.toString().toString());
                    }
                }
                y9.a e2 = s.getDescriptor().e();
                k71.k.g(e2, "kind");
                if (e2 instanceof i81.j) {
                    throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (e2 instanceof i81.f) {
                    throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                }
                if (e2 instanceof i81.d) {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
                }
            }
            kSerializer = s;
        }
        if (h != null) {
            String a = kSerializer.getDescriptor().a();
            this.h = h;
            this.i = a;
        }
        kSerializer.serialize(this, obj);
    }

    public final void o(long j) {
        if (this.g) {
            p(String.valueOf(j));
        } else {
            this.a.j(j);
        }
    }

    public final void p(String str) {
        k71.k.g(str, "value");
        this.a.m(str);
    }
}
