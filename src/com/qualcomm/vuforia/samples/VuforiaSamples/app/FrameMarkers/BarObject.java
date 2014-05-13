/*==============================================================================
 Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc.
 All Rights Reserved.
 ==============================================================================*/

package com.qualcomm.vuforia.samples.VuforiaSamples.app.FrameMarkers;

import java.nio.Buffer;

import com.qualcomm.vuforia.samples.SampleApplication.utils.MeshObject;


public class BarObject extends MeshObject
{
    // Data for drawing the 3D plane as overlay
    private static final double objVertices[] = {

  // f 1//1 2//1 3//1
  0.499999750000125, -0.0749999625000188, -0.0749999625000187,
  0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  -0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  // f 5//2 8//2 6//2
  0.5, 0.0749999625000186, -0.0749999625000187,
  -0.499999750000125, 0.0749999625000186, -0.0749999625000187,
  0.49999950000025, 0.0749999625000186, 0.0749999625000187,
  // f 1//3 5//3 6//3
  0.499999750000125, -0.0749999625000188, -0.0749999625000187,
  0.5, 0.0749999625000186, -0.0749999625000187,
  0.49999950000025, 0.0749999625000186, 0.0749999625000187,
  // f 2//4 6//4 7//4
  0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  0.49999950000025, 0.0749999625000186, 0.0749999625000187,
  -0.5, 0.0749999625000186, 0.0749999625000187,
  // f 3//5 7//5 4//5
  -0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  -0.5, 0.0749999625000186, 0.0749999625000187,
  -0.49999950000025, -0.0749999625000188, -0.0749999625000187,
  // f 5//6 1//6 4//6
  0.5, 0.0749999625000186, -0.0749999625000187,
  0.499999750000125, -0.0749999625000188, -0.0749999625000187,
  -0.49999950000025, -0.0749999625000188, -0.0749999625000187,
  // f 4//1 1//1 3//1
  -0.49999950000025, -0.0749999625000188, -0.0749999625000187,
  0.499999750000125, -0.0749999625000188, -0.0749999625000187,
  -0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  // f 8//2 7//2 6//2
  -0.499999750000125, 0.0749999625000186, -0.0749999625000187,
  -0.5, 0.0749999625000186, 0.0749999625000187,
  0.49999950000025, 0.0749999625000186, 0.0749999625000187,
  // f 2//7 1//7 6//7
  0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  0.499999750000125, -0.0749999625000188, -0.0749999625000187,
  0.49999950000025, 0.0749999625000186, 0.0749999625000187,
  // f 3//4 2//4 7//4
  -0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  0.499999750000125, -0.0749999625000188, 0.0749999625000187,
  -0.5, 0.0749999625000186, 0.0749999625000187,
  // f 7//5 8//5 4//5
  -0.5, 0.0749999625000186, 0.0749999625000187,
  -0.499999750000125, 0.0749999625000186, -0.0749999625000187,
  -0.49999950000025, -0.0749999625000188, -0.0749999625000187,
  // f 8//6 5//6 4//6
  -0.499999750000125, 0.0749999625000186, -0.0749999625000187,
  0.5, 0.0749999625000186, -0.0749999625000187,
  -0.49999950000025, -0.0749999625000188, -0.0749999625000187,

    };

    private static final double objNormals[] = {

  // f 1//1 2//1 3//1
  0, -1, 0,
  0, -1, 0,
  0, -1, 0,
  // f 5//2 8//2 6//2
  0, 1, 0,
  0, 1, 0,
  0, 1, 0,
  // f 1//3 5//3 6//3
  0.99999999999, -1.99999999998e-06, 3.99999999996e-06,
  0.99999999999, -1.99999999998e-06, 3.99999999996e-06,
  0.99999999999, -1.99999999998e-06, 3.99999999996e-06,
  // f 2//4 6//4 7//4
  0, 0, 1,
  0, 0, 1,
  0, 0, 1,
  // f 3//5 7//5 4//5
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  // f 5//6 1//6 4//6
  0, 0, -1,
  0, 0, -1,
  0, 0, -1,
  // f 4//1 1//1 3//1
  0, -1, 0,
  0, -1, 0,
  0, -1, 0,
  // f 8//2 7//2 6//2
  0, 1, 0,
  0, 1, 0,
  0, 1, 0,
  // f 2//7 1//7 6//7
  0.999999999998, 1.999999999996e-06, 0,
  0.999999999998, 1.999999999996e-06, 0,
  0.999999999998, 1.999999999996e-06, 0,
  // f 3//4 2//4 7//4
  0, 0, 1,
  0, 0, 1,
  0, 0, 1,
  // f 7//5 8//5 4//5
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  -0.9999999999975, -9.999999999975e-07, -1.999999999995e-06,
  // f 8//6 5//6 4//6
  0, 0, -1,
  0, 0, -1,
  0, 0, -1,

    };

    private static final double objTexcoords[] = {

    };

    private static final short objIndices[] = {

    };

    Buffer mVertBuff;
    Buffer mTexCoordBuff;
    Buffer mNormBuff;
    Buffer mIndBuff;


    public BarObject()
    {
        mVertBuff = fillBuffer(objVertices);
        mTexCoordBuff = fillBuffer(objTexcoords);
        mNormBuff = fillBuffer(objNormals);
        mIndBuff = fillBuffer(objIndices);
    }


    @Override
    public Buffer getBuffer(BUFFER_TYPE bufferType)
    {
        Buffer result = null;
        switch (bufferType)
        {
            case BUFFER_TYPE_VERTEX:
                result = mVertBuff;
                break;
            case BUFFER_TYPE_TEXTURE_COORD:
                result = mTexCoordBuff;
                break;
            case BUFFER_TYPE_INDICES:
                result = mIndBuff;
                break;
            case BUFFER_TYPE_NORMALS:
                result = mNormBuff;
            default:
                break;
        }
        return result;
    }


    @Override
    public int getNumObjectVertex()
    {
        return objVertices.length / 3;
    }


    @Override
    public int getNumObjectIndex()
    {
        return objIndices.length;
    }
}

