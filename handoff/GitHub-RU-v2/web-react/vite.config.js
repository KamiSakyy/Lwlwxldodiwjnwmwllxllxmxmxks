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
    chunkSizeWarningLimit: 2000,
  },
});
