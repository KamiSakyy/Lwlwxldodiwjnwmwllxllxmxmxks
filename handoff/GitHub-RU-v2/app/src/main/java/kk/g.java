package kk;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final mj.a a;
    public final d b;
    public final b c;

    public g(mj.a aVar, d dVar, b bVar) {
        k.g(aVar, "authorMapper");
        k.g(dVar, "categoryMapper");
        k.g(bVar, "answerMapper");
        this.a = aVar;
        this.b = dVar;
        this.c = bVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 jk.f, still in use, count: 2, list:
          (r3v0 jk.f) from 0x0057: MOVE (r16v0 jk.f) = (r3v0 jk.f)
          (r3v0 jk.f) from 0x0042: MOVE (r16v4 jk.f) = (r3v0 jk.f)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final jk.f a(b01.b r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "serverDiscussion"
            k71.k.g(r1, r2)
            jk.f r3 = new jk.f
            java.lang.String r4 = r1.a
            int r5 = r1.r
            java.lang.String r6 = r1.b
            java.lang.String r7 = r1.e
            java.lang.String r8 = r1.g
            java.time.ZonedDateTime r9 = r1.n
            java.time.ZonedDateTime r10 = r1.o
            java.time.ZonedDateTime r11 = r1.q
            b01.e r2 = r1.m
            kk.d r12 = r0.b
            r12.getClass()
            com.github.domain.discussions.data.DiscussionCategoryData r12 = b31.b.e0(r2)
            com.github.service.models.response.a r2 = r1.c
            mj.a r13 = r0.a
            r13.getClass()
            lj.a r13 = mj.a.a(r2)
            int r2 = r1.u
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            kk.b r2 = r0.c
            r2.getClass()
            b01.c r15 = r1.s
            if (r15 == 0) goto L57
            jk.b r0 = new jk.b
            r16 = r3
            java.lang.String r3 = r15.a
            kk.e r2 = r2.a
            r17 = r4
            b01.g r4 = r15.b
            jk.d r2 = r2.a(r4)
            java.lang.String r4 = r15.c
            r0.<init>(r3, r2, r4)
        L55:
            r15 = r0
            goto L5d
        L57:
            r16 = r3
            r17 = r4
            r0 = 0
            goto L55
        L5d:
            java.lang.String r0 = r1.t
            yz0.b8 r2 = r1.v
            java.lang.Object r3 = r1.w
            boolean r4 = r1.z
            b01.f r1 = r1.A
            r20 = r1
            r18 = r3
            r19 = r4
            r3 = r16
            r4 = r17
            r16 = r0
            r17 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r16 = r3
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.g.a(b01.b):jk.f");
    }
}
