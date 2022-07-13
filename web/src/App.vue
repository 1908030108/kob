<template>
  <div>
    <NavBar />
    <router-view></router-view>
  </div>
</template>

<script>
import NavBar from "./components/NavBar"
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"

export default {
  components:{
    NavBar
  }
}
</script>

<style>
  body {
     /* 版本问题 应用相对路径用 ~@ */
      background-image: url("~@/assets/images/background.png");
      background-size: cover;
  }
</style>
