package com.github.rudroid.utilities.ui;

import android.database.SQLException;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;

    public /* synthetic */ g(o7.e eVar, boolean z) {
        this.r = 3;
        this.t = eVar;
        this.s = z;
    }

    public final Object a() {
        y71.m1 c;
        switch (this.r) {
            case 0:
                return Boolean.valueOf(this.s && s3.f.a(((s3.f) ((androidx.compose.runtime.f1) this.t).getValue()).r, (float) 348) >= 0);
            case 1:
                b2.a0 a0Var = (b2.a0) this.t;
                if (this.s) {
                    b2.a0.a(a0Var);
                }
                return w61.a0.a;
            case 2:
                j71.a aVar = (j71.a) this.t;
                if (this.s) {
                    aVar.a();
                }
                return w61.a0.a;
            case 3:
                o7.e eVar = (o7.e) this.t;
                String str = this.s ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                eVar.s.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                eVar.r.d(sb);
                try {
                    sy.r.w(sb.toString(), 5);
                    throw null;
                } catch (SQLException e) {
                    int i = eVar.x;
                    if (i == 1) {
                        throw e;
                    }
                    if (i == 2) {
                        e.printStackTrace();
                    }
                    return w61.a0.a;
                }
            default:
                b1.b bVar = (b1.b) this.t;
                boolean z = this.s;
                w61.a0 a0Var2 = w61.a0.a;
                if (z && (c = bVar.c()) != null) {
                    c.m(a0Var2);
                }
                return a0Var2;
        }
    }

    public /* synthetic */ g(boolean z, Object obj, int i) {
        this.r = i;
        this.s = z;
        this.t = obj;
    }
}
