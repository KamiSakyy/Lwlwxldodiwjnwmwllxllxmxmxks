package h91;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public class w extends o {
    @Override // h91.o
    public final void A(a0 a0Var) {
        k71.k.g(a0Var, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = a0Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + a0Var);
    }

    @Override // h91.o
    public final List K(a0 a0Var) {
        File file = a0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + a0Var);
            }
            throw new FileNotFoundException("no such file: " + a0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            k71.k.d(str);
            arrayList.add(a0Var.e(str));
        }
        x61.p.H(arrayList);
        return arrayList;
    }

    @Override // h91.o
    public g4.f N(a0 a0Var) {
        k71.k.g(a0Var, "path");
        File file = a0Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new g4.f(isFile, isDirectory, (a0) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null);
        }
        return null;
    }

    @Override // h91.o
    public final v O(a0 a0Var) {
        return new v(false, new RandomAccessFile(a0Var.toFile(), "r"));
    }

    @Override // h91.o
    public final v W(a0 a0Var) {
        k71.k.g(a0Var, "file");
        return new v(true, new RandomAccessFile(a0Var.toFile(), "rw"));
    }

    @Override // h91.o
    public final i0 b0(a0 a0Var) {
        k71.k.g(a0Var, "file");
        return new z(new FileOutputStream(a0Var.toFile(), false), new m0());
    }

    @Override // h91.o
    public final k0 e0(a0 a0Var) {
        k71.k.g(a0Var, "file");
        return new u(new FileInputStream(a0Var.toFile()), m0.d);
    }

    @Override // h91.o
    public final i0 f(a0 a0Var) {
        k71.k.g(a0Var, "file");
        return new z(new FileOutputStream(a0Var.toFile(), true), new m0());
    }

    @Override // h91.o
    public void m(a0 a0Var, a0 a0Var2) {
        k71.k.g(a0Var, "source");
        k71.k.g(a0Var2, "target");
        if (a0Var.toFile().renameTo(a0Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + a0Var + " to " + a0Var2);
    }

    @Override // h91.o
    public final void t(a0 a0Var) {
        k71.k.g(a0Var, "dir");
        if (a0Var.toFile().mkdir()) {
            return;
        }
        g4.f N = N(a0Var);
        if (N == null || !N.c) {
            throw new IOException("failed to create directory: " + a0Var);
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
