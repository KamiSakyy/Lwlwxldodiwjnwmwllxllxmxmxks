package e8;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public r4.d[] f22095a;

    /* renamed from: b, reason: collision with root package name */
    public String f22096b;

    /* renamed from: c, reason: collision with root package name */
    public int f22097c;

    public l() {
        this.f22095a = null;
        this.f22097c = 0;
    }

    public r4.d[] getPathData() {
        return this.f22095a;
    }

    public String getPathName() {
        return this.f22096b;
    }

    public void setPathData(r4.d[] dVarArr) {
        r4.d[] dVarArr2 = this.f22095a;
        boolean z10 = false;
        if (dVarArr2 != null && dVarArr != null && dVarArr2.length == dVarArr.length) {
            int i = 0;
            while (true) {
                if (i >= dVarArr2.length) {
                    z10 = true;
                    break;
                }
                r4.d dVar = dVarArr2[i];
                char c10 = dVar.f31153a;
                r4.d dVar2 = dVarArr[i];
                if (c10 != dVar2.f31153a || dVar.f31154b.length != dVar2.f31154b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z10) {
            this.f22095a = b31.b.R(dVarArr);
            return;
        }
        r4.d[] dVarArr3 = this.f22095a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr3[i10].f31153a = dVarArr[i10].f31153a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f31154b;
                if (i11 < fArr.length) {
                    dVarArr3[i10].f31154b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f22095a = null;
        this.f22097c = 0;
        this.f22096b = lVar.f22096b;
        this.f22095a = b31.b.R(lVar.f22095a);
    }
}
