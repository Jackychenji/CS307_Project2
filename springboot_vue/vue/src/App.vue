<template>
  <div>
    <Header></Header>

    <div style="display: flex">
       <Aside/>
    </div>

    <div>
      <LineCanvas :canvasWidth="canvasWidth"
                  :canvasHeight="canvasHeight"
                  :dotsNum="dotsNum"
                  :isColor="isColor"
                  :backgroud="background">
      </LineCanvas>
    </div>


  </div>
  <router-view/>
</template>

<style>

</style>

<script>
import Header from "@/components/Header";
import Aside from "@/components/Aside";
import LineCanvas from 'vue-line-canvas';


export default{
  name: "Layout",
  components:{
    Header,
    Aside,
    LineCanvas,
  },
  data(){
    return {
      canvasWidth: window.innerWidth, // canvas width
      canvasHeight: window.innerHeight, // canvas height
      dotsNum: 50, // dot number
      isColor: true, // is color
      background: "pink",
    }
  }

}
</script>