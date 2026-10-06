import { defineConfig } from 'vite';
import react from '@vitejs/plugin-react';

// base './' ОБЯЗАТЕЛЕН: приложение открывается из assets через file://,
// все пути к чанкам должны быть относительными (иначе белый экран офлайн).
export default defineConfig({
  base: './',
  plugins: [react()],
  build: {
    outDir: 'dist',
    assetsDir: 'assets',
    target: ['es2020', 'chrome80'],
    cssMinify: true,
    reportCompressedSize: false,
    chunkSizeWarningLimit: 2000,
    // Один компактный бандл: ассеты уходят в APK, лишние чанки только мешают.
    rollupOptions: {
      output: {
        manualChunks: undefined,
        entryFileNames: 'assets/app-[hash].js',
        chunkFileNames: 'assets/chunk-[hash].js',
        assetFileNames: 'assets/[name]-[hash][extname]',
      },
    },
  },
});
