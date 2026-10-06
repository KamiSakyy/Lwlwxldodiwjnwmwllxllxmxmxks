package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public Object a;
    public Object b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public Object a() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        h4 h4Var = (h4) this.a;
        String str2 = (String) this.b;
        Context context = (Context) h4Var.b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        b51.d dVar = x3.a;
        if (contentResolver == null) {
            dVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (dVar) {
            try {
                if (((HashMap) dVar.b) == null) {
                    ((AtomicBoolean) dVar.a).set(false);
                    dVar.b = new HashMap(16, 1.0f);
                    dVar.g = new Object();
                    contentResolver.registerContentObserver(y3.a, true, new a4(dVar));
                } else if (((AtomicBoolean) dVar.a).getAndSet(false)) {
                    ((HashMap) dVar.b).clear();
                    ((HashMap) dVar.c).clear();
                    ((HashMap) dVar.d).clear();
                    ((HashMap) dVar.e).clear();
                    ((HashMap) dVar.f).clear();
                    dVar.g = new Object();
                }
                Object obj = dVar.g;
                String str3 = null;
                if (((HashMap) dVar.b).containsKey(str2)) {
                    String str4 = (String) ((HashMap) dVar.b).get(str2);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    uri = y3.a;
                    acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                } catch (zzjk unused) {
                }
                try {
                    if (acquireUnstableContentProviderClient == null) {
                        throw new zzjk("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                        try {
                            if (query == null) {
                                throw new zzjk("ContentProvider query returned null cursor");
                            }
                            if (query.moveToFirst()) {
                                str = query.getString(1);
                                query.close();
                            } else {
                                query.close();
                                str = null;
                            }
                            if (str != null && str.equals(null)) {
                                str = null;
                            }
                            synchronized (dVar) {
                                try {
                                    if (obj == dVar.g) {
                                        ((HashMap) dVar.b).put(str2, str);
                                    }
                                } finally {
                                }
                            }
                            if (str != null) {
                                return str;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e) {
                        throw new zzjk("ContentProvider query failed", e);
                    }
                } finally {
                    acquireUnstableContentProviderClient.release();
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        ArrayList arrayList = sVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.a).put(Integer.valueOf(((w) obj).r).toString(), sVar);
        }
    }

    public n c(w51.r rVar, n nVar) {
        i21.a.f0(rVar);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.s;
        String str = oVar.r;
        HashMap hashMap = (HashMap) this.a;
        return (hashMap.containsKey(str) ? (s) hashMap.get(str) : (s) this.b).a(str, rVar, arrayList);
    }

    public void d(w51.r rVar, a5.s sVar) {
        v4 v4Var = new v4(sVar);
        TreeMap treeMap = (TreeMap) this.a;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) sVar.u).clone();
            n c = ((m) treeMap.get(num)).c(rVar, Collections.singletonList(v4Var));
            int b0 = c instanceof g ? i21.a.b0(((g) c).r.doubleValue()) : -1;
            if (b0 == 2 || b0 == -1) {
                sVar.u = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n c2 = ((m) treeMap2.get((Integer) it.next())).c(rVar, Collections.singletonList(v4Var));
            if (c2 instanceof g) {
                i21.a.b0(((g) c2).r.doubleValue());
            }
        }
    }

    public t(int i) {
        switch (i) {
            case 3:
                this.a = new TreeMap();
                this.b = new TreeMap();
                break;
            default:
                this.a = new HashMap();
                this.b = new s(6);
                s sVar = new s(0);
                w wVar = w.w;
                ArrayList arrayList = sVar.a;
                arrayList.add(wVar);
                arrayList.add(w.x);
                arrayList.add(w.y);
                arrayList.add(w.z);
                arrayList.add(w.A);
                arrayList.add(w.B);
                arrayList.add(w.C);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.N;
                ArrayList arrayList2 = sVar2.a;
                arrayList2.add(wVar2);
                arrayList2.add(w.a0);
                arrayList2.add(w.b0);
                arrayList2.add(w.c0);
                arrayList2.add(w.d0);
                arrayList2.add(w.f0);
                arrayList2.add(w.g0);
                arrayList2.add(w.l0);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.u;
                ArrayList arrayList3 = sVar3.a;
                arrayList3.add(wVar3);
                arrayList3.add(w.D);
                arrayList3.add(w.E);
                arrayList3.add(w.F);
                arrayList3.add(w.K);
                arrayList3.add(w.H);
                arrayList3.add(w.L);
                arrayList3.add(w.P);
                arrayList3.add(w.e0);
                arrayList3.add(w.q0);
                arrayList3.add(w.t0);
                arrayList3.add(w.w0);
                arrayList3.add(w.x0);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.t;
                ArrayList arrayList4 = sVar4.a;
                arrayList4.add(wVar4);
                arrayList4.add(w.k0);
                arrayList4.add(w.n0);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.Q;
                ArrayList arrayList5 = sVar5.a;
                arrayList5.add(wVar5);
                arrayList5.add(w.R);
                arrayList5.add(w.S);
                arrayList5.add(w.T);
                arrayList5.add(w.U);
                arrayList5.add(w.V);
                arrayList5.add(w.W);
                arrayList5.add(w.B0);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.s;
                ArrayList arrayList6 = sVar6.a;
                arrayList6.add(wVar6);
                arrayList6.add(w.M);
                arrayList6.add(w.h0);
                arrayList6.add(w.i0);
                arrayList6.add(w.j0);
                arrayList6.add(w.o0);
                arrayList6.add(w.p0);
                arrayList6.add(w.r0);
                arrayList6.add(w.s0);
                arrayList6.add(w.v0);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.v;
                ArrayList arrayList7 = sVar7.a;
                arrayList7.add(wVar7);
                arrayList7.add(w.G);
                arrayList7.add(w.I);
                arrayList7.add(w.J);
                arrayList7.add(w.O);
                arrayList7.add(w.X);
                arrayList7.add(w.Y);
                arrayList7.add(w.Z);
                arrayList7.add(w.m0);
                arrayList7.add(w.u0);
                arrayList7.add(w.y0);
                arrayList7.add(w.z0);
                arrayList7.add(w.A0);
                b(sVar7);
                break;
        }
    }
}
