import React, { Suspense } from "react";
import { Canvas } from "@react-three/fiber";
import { OrbitControls, Preload, useGLTF } from "@react-three/drei";

import CanvasLoader from "../Loader";

const Microphone = () => {
  // importh the path of the model
  const microphone = useGLTF("./condenser_microphone/scene.gltf");

  return (
    <group>
      <primitive object={microphone.scene} scale={1.5} position-y={-2} rotation-y={0} />
      {/* Agregar luces aquí */}
      <directionalLight intensity={8} position={[5, 10, 5]} />
      <ambientLight intensity={0.5} />
    </group>
  );
};

// create the EarthCanvas
const MicrophoneCanvas = () => {
  return (
    <Canvas
      shadows
      frameloop='demand'
      dpr={[1, 2]}
      gl={{ preserveDrawingBuffer: true }}
      camera={{
        fov: 45,
        near: 0.1,
        far: 200,
        position: [-4, 3, 6],
      }}
    >
      {/* para mostrar algo mientras el modelo cargar */}
      <Suspense fallback={<CanvasLoader />}>
        <OrbitControls
          // para que el modelo permanezca rotando
          autoRotate
          enableZoom={false}
          maxPolarAngle={Math.PI / 2}
          minPolarAngle={Math.PI / 2}
        />

        {/* render the earth model */}
        <Microphone />

        <Preload all />
      </Suspense>
    </Canvas>
  )
}

export default MicrophoneCanvas;