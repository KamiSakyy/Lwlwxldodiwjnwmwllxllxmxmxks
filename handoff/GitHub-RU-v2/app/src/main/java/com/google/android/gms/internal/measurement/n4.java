package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: /home/user/work/p/classes4.dex */
public class n4 implements p.w, x41.k {
    public boolean r;
    public Object s;

    public n4(Uri uri, boolean z, boolean z2) {
        this.s = uri;
        this.r = z;
    }

    @Override // x41.k
    public void a(x41.j jVar, int i) {
        StringBuilder sb = (StringBuilder) this.s;
        if (this.r) {
            this.r = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b(p.l lVar, boolean z) {
        q.j jVar;
        k.g0 g0Var = (k.g0) this.s;
        if (this.r) {
            return;
        }
        this.r = true;
        ActionMenuView actionMenuView = g0Var.a.a.r;
        if (actionMenuView != null && (jVar = actionMenuView.K) != null) {
            jVar.g();
            q.f fVar = jVar.K;
            if (fVar != null && fVar.b()) {
                ((p.v) fVar).i.dismiss();
            }
        }
        g0Var.b.onPanelClosed(108, lVar);
        this.r = false;
    }

    public void c() {
        synchronized (this) {
            try {
                if (this.r) {
                    return;
                }
                this.r = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.s;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        return this.r;
    }

    public boolean e(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        y4.e eVar = (y4.e) this.s;
        if (eVar == null) {
            return d();
        }
        eVar.getClass();
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            n4 n4Var = y4.f.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return d();
        }
        return false;
    }

    public void f() {
        this.r = false;
    }

    public void g(byte b) {
        ((b21.v) this.s).B(String.valueOf(b));
    }

    public void h(char c) {
        b21.v vVar = (b21.v) this.s;
        vVar.k(vVar.s, 1);
        char[] cArr = (char[]) vVar.t;
        int i = vVar.s;
        vVar.s = i + 1;
        cArr[i] = c;
    }

    public void i(int i) {
        ((b21.v) this.s).B(String.valueOf(i));
    }

    public void j(long j) {
        ((b21.v) this.s).B(String.valueOf(j));
    }

    public void k(String str) {
        k71.k.g(str, "v");
        ((b21.v) this.s).B(str);
    }

    public void l(short s) {
        ((b21.v) this.s).B(String.valueOf(s));
    }

    public void m(String str) {
        int i;
        k71.k.g(str, "value");
        b21.v vVar = (b21.v) this.s;
        vVar.k(vVar.s, str.length() + 2);
        char[] cArr = (char[]) vVar.t;
        int i2 = vVar.s;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = m81.t.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    vVar.k(i5, 2);
                    char charAt = str.charAt(i6);
                    byte[] bArr2 = m81.t.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            ((char[]) vVar.t)[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str2 = m81.t.a[charAt];
                                k71.k.d(str2);
                                vVar.k(i5, str2.length());
                                str2.getChars(0, str2.length(), (char[]) vVar.t, i5);
                                int length3 = str2.length() + i5;
                                vVar.s = length3;
                                i5 = length3;
                            } else {
                                char[] cArr2 = (char[]) vVar.t;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                vVar.s = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        ((char[]) vVar.t)[i5] = charAt;
                    }
                    i5 = i;
                }
                vVar.k(i5, 1);
                ((char[]) vVar.t)[i5] = '\"';
                vVar.s = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        vVar.s = i4 + 1;
    }

    public void n(t6.d dVar) {
        i4.S(this.r, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
        this.s = dVar;
    }

    public void o() {
    }

    public boolean p(p.l lVar) {
        ((k.g0) this.s).b.onMenuOpened(108, lVar);
        return true;
    }

    public void q() {
    }

    public void r(com.google.android.gms.internal.play_billing.q3 q3Var) {
        if (this.r) {
            int i = com.google.android.gms.internal.play_billing.t.a;
            Log.isLoggable("BillingLogger", 5);
        } else {
            try {
                ((androidx.lifecycle.l1) this.s).D(new j11.a(q3Var, j11.d.r, null), new m11.r(0));
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.t.a;
                Log.isLoggable("BillingLogger", 5);
            }
        }
    }

    public m4 s(String str, long j) {
        Long valueOf = Long.valueOf(j);
        Object obj = m4.g;
        return new m4(this, str, valueOf, 0);
    }

    public m4 t(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = m4.g;
        return new m4(this, str, valueOf, 1);
    }

    public m4 u(String str, String str2) {
        Object obj = m4.g;
        return new m4(this, str, str2, 3);
    }

    public /* synthetic */ n4(Object obj) {
        this.s = obj;
    }

    public /* synthetic */ n4(Object obj, byte b) {
        this.s = obj;
        this.r = true;
    }

    public /* synthetic */ n4(Object obj, boolean z) {
        this.s = obj;
        this.r = z;
    }

    public n4(y4.e eVar, boolean z) {
        this(eVar);
        this.r = z;
    }
}
