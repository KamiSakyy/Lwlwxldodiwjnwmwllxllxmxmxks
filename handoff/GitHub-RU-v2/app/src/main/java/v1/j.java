package v1;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends c71.i implements j71.e {

    /* renamed from: t, reason: collision with root package name */
    public long[] f32375t;

    /* renamed from: u, reason: collision with root package name */
    public int f32376u;

    /* renamed from: v, reason: collision with root package name */
    public int f32377v;

    /* renamed from: w, reason: collision with root package name */
    public int f32378w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f32379x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f32380y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, a71.c cVar) {
        super(2, cVar);
        this.f32380y = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        j jVar = new j(this.f32380y, cVar);
        jVar.f32379x = obj;
        return jVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (s71.i) obj).v(w61.a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c5 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:20:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        s71.i iVar;
        long[] jArr;
        int length;
        int i;
        s71.i iVar2;
        int i10;
        s71.i iVar3;
        int i11;
        k kVar = this.f32380y;
        long j10 = kVar.f32382r;
        long j11 = kVar.f32384t;
        long j12 = kVar.f32383s;
        b71.a aVar = b71.a.r;
        int i12 = this.f32378w;
        if (i12 == 0) {
            sy.y.j(obj);
            iVar = (s71.i) this.f32379x;
            jArr = kVar.f32385u;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j12 != 0) {
                iVar2 = iVar;
                i10 = 0;
                if (i10 >= 64) {
                }
            }
            if (j10 != 0) {
            }
            return w61.a0.a;
        }
        if (i12 == 1) {
            length = this.f32377v;
            int i13 = this.f32376u;
            jArr = this.f32375t;
            iVar = (s71.i) this.f32379x;
            sy.y.j(obj);
            i = i13 + 1;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f32376u;
                iVar3 = (s71.i) this.f32379x;
                sy.y.j(obj);
                i11++;
                if (i11 < 64) {
                    if (((1 << i11) & j10) != 0) {
                        Long l = new Long(j11 + i11 + 64);
                        this.f32379x = iVar3;
                        this.f32375t = null;
                        this.f32376u = i11;
                        this.f32378w = 3;
                        iVar3.b(this, l);
                        b71.a aVar2 = b71.a.r;
                        return aVar;
                    }
                    i11++;
                    if (i11 < 64) {
                    }
                }
                return w61.a0.a;
            }
            i10 = this.f32376u;
            iVar2 = (s71.i) this.f32379x;
            sy.y.j(obj);
            i10++;
            if (i10 >= 64) {
                iVar = iVar2;
                if (j10 != 0) {
                    iVar3 = iVar;
                    i11 = 0;
                    if (i11 < 64) {
                    }
                }
                return w61.a0.a;
            }
            if (((1 << i10) & j12) != 0) {
                Long l5 = new Long(j11 + i10);
                this.f32379x = iVar2;
                this.f32375t = null;
                this.f32376u = i10;
                this.f32378w = 2;
                iVar2.b(this, l5);
                b71.a aVar3 = b71.a.r;
                return aVar;
            }
            i10++;
            if (i10 >= 64) {
            }
        }
        if (i < length) {
            Long l8 = new Long(jArr[i]);
            this.f32379x = iVar;
            this.f32375t = jArr;
            this.f32376u = i;
            this.f32377v = length;
            this.f32378w = 1;
            iVar.b(this, l8);
            return aVar;
        }
        if (j12 != 0) {
        }
        if (j10 != 0) {
        }
        return w61.a0.a;
    }
}
