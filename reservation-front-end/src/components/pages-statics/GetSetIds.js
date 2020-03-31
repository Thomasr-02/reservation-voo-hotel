var idUser;
var idVoo;
var idHotel;
var idCompra;

const GetSetIds ={
    idUser: (value , msg)=>{
        if(msg === 'set'){
            idUser = value;
            
        }
        if(msg === 'get'){
            return idUser
        }
    },

    idVoo: (value , msg)=>{
        if(msg === 'set'){
            idVoo = value;
        }
        if(msg === 'get'){
            return idVoo
        }
    },


    idHotel: (value , msg)=>{
        if(msg === 'set'){
            idHotel = value;
        }
        if(msg === 'get'){
            return idHotel
        }
    }
    ,


    idCompra: (value , msg)=>{
        if(msg === 'set'){
            idCompra = value;
        }
        if(msg === 'get'){
            return idCompra
        }
    }


}

export default GetSetIds;