package a0;

/* loaded from: /home/user/work/p/classes.dex */
public interface i2 {
    boolean a();

    long b(u uVar, u uVar2, u uVar3);

    u d(long j10, u uVar, u uVar2, u uVar3);

    default u g(u uVar, u uVar2, u uVar3) {
        return d(b(uVar, uVar2, uVar3), uVar, uVar2, uVar3);
    }

    u h(long j10, u uVar, u uVar2, u uVar3);
}
