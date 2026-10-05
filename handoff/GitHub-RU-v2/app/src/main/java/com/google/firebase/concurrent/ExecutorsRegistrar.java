package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import i4.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import m11.r;
import o41.a;
import o41.b;
import o41.c;
import o41.d;
import p41.e;
import p41.k;
import p41.o;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: /home/user/work/p/classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final k a = new k(new e(2));
    public static final k b = new k(new e(3));
    public static final k c = new k(new e(4));
    public static final k d = new k(new e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o oVar = new o(a.class, ScheduledExecutorService.class);
        o[] oVarArr = {new o(a.class, ExecutorService.class), new o(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            m71.a.n(oVar2, "Null interface");
        }
        Collections.addAll(hashSet, oVarArr);
        p41.a aVar = new p41.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new r(6), hashSet3);
        o oVar3 = new o(b.class, ScheduledExecutorService.class);
        o[] oVarArr2 = {new o(b.class, ExecutorService.class), new o(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oVar3);
        for (o oVar4 : oVarArr2) {
            m71.a.n(oVar4, "Null interface");
        }
        Collections.addAll(hashSet4, oVarArr2);
        p41.a aVar2 = new p41.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new r(7), hashSet6);
        o oVar5 = new o(c.class, ScheduledExecutorService.class);
        o[] oVarArr3 = {new o(c.class, ExecutorService.class), new o(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oVar5);
        for (o oVar6 : oVarArr3) {
            m71.a.n(oVar6, "Null interface");
        }
        Collections.addAll(hashSet7, oVarArr3);
        p41.a aVar3 = new p41.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new r(8), hashSet9);
        u b2 = p41.a.b(new o(d.class, Executor.class));
        b2.f = new r(9);
        return Arrays.asList(aVar, aVar2, aVar3, b2.b());
    }
}
