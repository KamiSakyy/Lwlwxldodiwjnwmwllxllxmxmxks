package com.github.rudroid.repository.file;

import java.io.IOException;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class f implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19394r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19395s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f19396t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f19397u;

    public /* synthetic */ f(int i, String str, k81.y yVar) {
        this.f19394r = 1;
        this.f19395s = i;
        this.f19396t = str;
        this.f19397u = yVar;
    }

    public final Object a() {
        switch (this.f19394r) {
            case k5.f.J /* 0 */:
                ((j71.e) this.f19396t).s(Integer.valueOf(this.f19395s), (List) this.f19397u);
                return w61.a0.a;
            case 1:
                String str = (String) this.f19396t;
                k81.y yVar = (k81.y) this.f19397u;
                int i = this.f19395s;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
                for (int i10 = 0; i10 < i; i10++) {
                    serialDescriptorArr[i10] = t1.o(str + '.' + ((k81.e1) yVar).e[i10], i81.k.h, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                x81.o oVar = (x81.o) this.f19396t;
                try {
                    oVar.O.F(this.f19395s, (x81.a) this.f19397u);
                } catch (IOException e5) {
                    x81.a aVar = x81.a.u;
                    oVar.f(aVar, aVar, e5);
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ f(Object obj, int i, Object obj2, int i10) {
        this.f19394r = i10;
        this.f19396t = obj;
        this.f19395s = i;
        this.f19397u = obj2;
    }
}
