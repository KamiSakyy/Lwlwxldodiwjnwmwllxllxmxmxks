package u5;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f32225a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final q f32226b;

    /* renamed from: c, reason: collision with root package name */
    public q f32227c;

    /* renamed from: d, reason: collision with root package name */
    public q f32228d;

    /* renamed from: e, reason: collision with root package name */
    public int f32229e;

    /* renamed from: f, reason: collision with root package name */
    public int f32230f;

    public n(q qVar) {
        this.f32226b = qVar;
        this.f32227c = qVar;
    }

    public final int a(int i) {
        SparseArray sparseArray = this.f32227c.f32240a;
        q qVar = sparseArray == null ? null : (q) sparseArray.get(i);
        int i10 = 1;
        int i11 = 2;
        if (this.f32225a == 2) {
            if (qVar != null) {
                this.f32227c = qVar;
                this.f32230f++;
            } else if (i == 65038) {
                b();
            } else if (i != 65039) {
                q qVar2 = this.f32227c;
                if (qVar2.f32241b != null) {
                    i11 = 3;
                    if (this.f32230f != 1) {
                        this.f32228d = qVar2;
                        b();
                    } else if (c()) {
                        this.f32228d = this.f32227c;
                        b();
                    } else {
                        b();
                    }
                } else {
                    b();
                }
            }
            i10 = i11;
        } else if (qVar == null) {
            b();
        } else {
            this.f32225a = 2;
            this.f32227c = qVar;
            this.f32230f = 1;
            i10 = i11;
        }
        this.f32229e = i;
        return i10;
    }

    public final void b() {
        this.f32225a = 1;
        this.f32227c = this.f32226b;
        this.f32230f = 0;
    }

    public final boolean c() {
        androidx.emoji2.text.flatbuffer.a c10 = this.f32227c.f32241b.c();
        int a10 = c10.a(6);
        return !(a10 == 0 || ((ByteBuffer) c10.f469u).get(a10 + c10.f466r) == 0) || this.f32229e == 65039;
    }
    public Object a = null;
    public Object b = null;
    public Object c = null;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public Object j = null;
    public Object k = null;
    public Object o = null;
}
