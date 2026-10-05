package cz0;

import c71.j;
import com.github.service.ghes317.repository.model.ForkRepositoryInput;
import j71.c;
import py0.e;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends j implements c {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, String str, String str2, String str3, boolean z, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.B = obj;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = z;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                a71.c cVar = (a71.c) obj;
                return new a((b) this.B, this.x, this.y, this.z, this.A, cVar, 0).v(a0.a);
            default:
                a71.c cVar2 = (a71.c) obj;
                return new a((b) this.B, this.x, this.y, this.z, this.A, cVar2, 1).v(a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                e eVar = (e) ((b) this.B).t;
                ForkRepositoryInput forkRepositoryInput = new ForkRepositoryInput(this.z, this.A);
                this.w = 1;
                Object a = eVar.a(this.x, this.y, forkRepositoryInput, this);
                return a == aVar ? aVar : a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                m00.e eVar2 = (m00.e) ((b) this.B).t;
                com.github.service.dotcom.repository.model.ForkRepositoryInput forkRepositoryInput2 = new com.github.service.dotcom.repository.model.ForkRepositoryInput(this.z, this.A);
                this.w = 1;
                Object a2 = eVar2.a(this.x, this.y, forkRepositoryInput2, this);
                return a2 == aVar2 ? aVar2 : a2;
        }
    }
}
